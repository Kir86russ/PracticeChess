package mainFiles;

import figures.Cell;
import figures.Figure;
import figures.black.*;
import figures.white.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Chess extends Application {

    private File dir = new File("C://Users//Кирилл//IdeaProjects//Whys//PracticeChess//SaveFiles");
    private Logic logic = new Logic();
    private BorderPane border;
    private Group grid;
    private static Text text;
    private ArrayList<superRectangle> rectList = new ArrayList<>();

    private Rectangle buildRectangle(int x, int y, int size, int color) {
        Rectangle rect = new Rectangle();
        rect.setX(x * size);
        rect.setY(y * size);
        rect.setHeight(size);
        rect.setWidth(size);
        if (color == 0) {
            rect.setFill(Color.rgb(255, 236, 137));
        } else {
            rect.setFill(Color.rgb(178, 85, 0));
        }
        rect.setStroke(Color.BLACK);
        return rect;
    }


    class superRectangle extends Rectangle {

        char charImg;
        private boolean flag = false;

        private boolean getFlag() {
            return flag;
        }

        private void setFlag(boolean flag) {
            this.flag = flag; // Для удаления
        }

        superRectangle() {
            super();
        }

    }

    private Rectangle buildFigure(int x, int y, int size, String image) {

        superRectangle rect = new superRectangle();

        rect.setX(x);
        rect.setY(y);
        rect.setHeight(size);
        rect.setWidth(size);
        /*
        a) wP   g) bP
        b) wR   h) bR
        c) wKn  i) bKn
        d) wB   j) bB
        e) wK   k) bK
        f) wQ   o) bQ
         */
        Image img = new Image(getClass().getClassLoader().getResource(image).toString());
        rect.setFill(new ImagePattern(img));

        if (image.equals("PawnWhite.png")) rect.charImg = 'a';
        if (image.equals("RookWhite.png")) rect.charImg = 'b';
        if (image.equals("KnightWhite.png")) rect.charImg = 'c';
        if (image.equals("BishopWhite.png")) rect.charImg = 'd';
        if (image.equals("KingWhite.png")) rect.charImg = 'e';
        if (image.equals("QueenWhite.png")) rect.charImg = 'f';

        if (image.equals("PawnBlack.png")) rect.charImg = 'g';
        if (image.equals("RookBlack.png")) rect.charImg = 'h';
        if (image.equals("KnightBlack.png")) rect.charImg = 'i';
        if (image.equals("BishopBlack.png")) rect.charImg = 'j';
        if (image.equals("KingBlack.png")) rect.charImg = 'k';
        if (image.equals("QueenBlack.png")) rect.charImg = 'l';

        rectList.add(rect);

        Rectangle moment = new Rectangle(x, y);
        rect.setOnDragDetected( // Зажим
                event -> {
                    moment.setX(event.getX());
                    moment.setY(event.getY());
                }
        );
        rect.setOnMouseDragged( // Перетаскивание в зажиме
                event -> {
                    rect.setX(event.getX() - 30);
                    rect.setY(event.getY() - 30);
                }
        );
        rect.setOnMouseReleased(    // Отпустим фигуру
                event -> {
                    if (findBy(moment.getX(), moment.getY()) != null) {
                        //   ((((((((SOURCE)))))                     ((((((DEST)))))
                        if (logic.move(findBy(moment.getX(), moment.getY()), findBy(event.getX(), event.getY()))) {
                            if (KingWhite.rokirovkaRightFlag) {
                                for (int i = 0; i != rectList.size(); i++) {
                                    if (rectList.get(i).getX() == 570.0 && rectList.get(i).getY() == 10.0) {
                                        rectList.get(i).setX(330);
                                        rectList.get(i).setY(10);
                                        KingWhite.rokirovkaRightFlag = false;
                                        break;
                                    }
                                }
                            }

                            if (KingWhite.rokirovkaLeftFlag) {
                                for (int i = 0; i != rectList.size(); i++) {
                                    if (rectList.get(i).getX() == 10.0 && rectList.get(i).getY() == 10.0) {
                                        rectList.get(i).setX(170);
                                        rectList.get(i).setY(10);
                                        KingWhite.rokirovkaLeftFlag = false;
                                        break;
                                    }
                                }
                            }

                            if (KingBlack.rokirovkaRightFlag) {
                                for (int i = 0; i != rectList.size(); i++) {
                                    if (rectList.get(i).getX() == 570.0 && rectList.get(i).getY() == 570.0) {
                                        rectList.get(i).setX(330);
                                        rectList.get(i).setY(570);
                                        KingBlack.rokirovkaRightFlag = false;
                                        break;
                                    }
                                }
                            }

                            if (KingBlack.rokirovkaLeftFlag) {
                                for (int i = 0; i != rectList.size(); i++) {
                                    if (rectList.get(i).getX() == 10.0 && rectList.get(i).getY() == 570.0) {
                                        rectList.get(i).setX(170);
                                        rectList.get(i).setY(570);
                                        KingBlack.rokirovkaLeftFlag = false;
                                        break;
                                    }
                                }
                            }

                            rect.setX(((int) event.getX() / 80) * 80 + 10);
                            rect.setY(((int) event.getY() / 80) * 80 + 10);
                            rect.setFlag(true);


                            for (int i = 0; i != rectList.size(); i++) {


                                if (rectList.get(i).getX() == (double) findBy(event.getX(), event.getY()).x * 80 + 10 && rectList.get(i).getY() == (double) findBy(event.getX(), event.getY()).y * 80 + 10 && !rectList.get(i).getFlag()) {
                                    grid.getChildren().remove(rectList.get(i));
                                    rectList.get(i).setX(-1);
                                    rectList.get(i).setY(-1);
                                }


                            }

                            rect.setFlag(false);

                            if (Logic.isMat) {
                                for (int i = 0; i != rectList.size(); i++) {
                                    rectList.get(i).setDisable(true);
                                }
                                if (Logic.count % 2 == 0) {
                                    text = new Text("Чёрные выиграли!");
                                    text.setLayoutX(300);
                                    text.setLayoutY(70);
                                    text.setFont(new Font(40));
                                    text.setFill(Color.GREEN);
                                    border.getChildren().add(text);

                                } else {
                                    text = new Text("Белые выиграли!");
                                    text.setLayoutX(330);
                                    text.setLayoutY(70);
                                    text.setFont(new Font(40));
                                    text.setFill(Color.GREEN);
                                    border.getChildren().add(text);
                                }
                            }

                        } else {

                            rect.setX(((int) moment.getX() / 80) * 80 + 10);
                            rect.setY(((int) moment.getY() / 80) * 80 + 10);

                        }
                    }
                    if (findBy(moment.getX(), moment.getY()) == null) {  // Чтоб не слетала фигура с доски
                        rect.setX(((int) event.getX() / 80) * 80 + 10);
                        rect.setY(((int) event.getY() / 80) * 80 + 10);
                    }

                    moment.setX(event.getX()); // Анти-нажималка при клике по фигуре, анти-возврат назад
                    moment.setY(event.getY());

                }
        );
        return rect;
    }


    private Group buildGrid() {
        grid = new Group();
        int color;
        for (int x = 0; x != 8; x++) {
            for (int y = 0; y != 8; y++) {
                color = (x + y) % 2;
                grid.getChildren().add(buildRectangle(x, y, 80, color));
            }
        }
        return grid;
    }

    @Override
    public void start(Stage stage) {

        border = new BorderPane(buildGrid());

        Button start = new Button("Реванш");
        Button save = new Button("Сохранить");
        Button load = new Button("Загрузить");

        start.setPrefSize(100, 70);
        save.setPrefSize(100, 70);
        load.setPrefSize(100, 70);

        HBox buttonsBox = new HBox(50, save, start, load); // setSpacing = 50

        buttonsBox.setAlignment(Pos.BASELINE_CENTER);
        buttonsBox.setPrefHeight(150);

        border.setBottom(buttonsBox);


        start.setOnMouseClicked(
                event -> refresh(border)
        );


        save.setOnMouseClicked(
                event -> saveGame()
        );


        load.setOnMouseClicked(
                event -> loadGame()
        );


        stage.setScene(new Scene(border, 900, 950));
        stage.setTitle("Шахматы");
        stage.setResizable(false);
        stage.show();
        refresh(border); // Отрисовка фигур
    }

    private void saveGame() {
        TextField nameFile = new TextField();
        Label label = new Label("Write name file for saving");
        Button button = new Button("Ok");
        Pane pane = new Pane();
        label.setLayoutX(87.5);
        nameFile.setLayoutX(80);
        nameFile.setLayoutY(25);
        button.setLayoutX(152);
        button.setLayoutY(70);
        pane.getChildren().add(nameFile);
        pane.getChildren().add(label);
        pane.getChildren().add(button);

        Scene scene = new Scene(pane, 350, 120);

        Stage saveStage = new Stage();
        saveStage.setTitle("Saving");
        saveStage.setScene(scene);
        saveStage.show();

        button.setOnMouseClicked(
                event -> {
                    try {

                        File file = new File(dir.getAbsolutePath(), nameFile.getText());
                                                                                                                            //                        if (file.exists()){
                                                                                                                            //                            file.delete();
                                                                                                                            //                            file.createNewFile();
                                                                                                                            //                        }

                        if (!file.exists()) {


                            FileWriter fileWriter = new FileWriter(file);


                            if (Logic.isShah) fileWriter.write("trueShah");
                            else fileWriter.write("falseShah");
                            fileWriter.write('\n');

                            if (Logic.count % 2 == 0) fileWriter.write("white");
                            else fileWriter.write("black");
                            fileWriter.write('\n');

                            for (int i = 0; i != rectList.size(); i++) {

                                fileWriter.write(Integer.toString((int) rectList.get(i).getX()));
                                fileWriter.write(' ');
                                fileWriter.write(Integer.toString((int) rectList.get(i).getY()));
                                fileWriter.write(' ');
                                fileWriter.write(rectList.get(i).charImg);
                                fileWriter.write(' ');
                                fileWriter.write(' ');

                                fileWriter.write(' ');
                                if (i == 7 || i == 15 || i == 23 || i == 31 || i == 39 || i == 47 || i == 55)
                                    fileWriter.write('\n');
                            }

                            fileWriter.flush();
                            fileWriter.close();
                            saveStage.close();
                        } else {
                            Text errorText = new Text("File already exist");
                            errorText.setFill(Color.RED);
                            errorText.setLayoutX(200);
                            errorText.setLayoutY(98);
                            pane.getChildren().add(errorText);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );
    }

    private void loadGame() {
        if (text != null) text.setVisible(false);

        TextField textField = new TextField();
        Label label = new Label("Write file from list");
        Button button = new Button("Ok");

        String str = Arrays.toString(dir.list());
        Text filesLoad = new Text(str);

        Pane pane = new Pane();
        label.setLayoutX(112.5);
        textField.setLayoutX(80);
        textField.setLayoutY(25);
        button.setLayoutX(152);
        button.setLayoutY(70);
        filesLoad.setLayoutY(125);
        pane.getChildren().add(textField);
        pane.getChildren().add(label);
        pane.getChildren().add(button);
        pane.getChildren().add(filesLoad);

        Scene scene = new Scene(pane, 350, 150);

        Stage loadStage = new Stage();
        loadStage.setTitle("Loading");
        loadStage.setScene(scene);
        loadStage.show();

        button.setOnMouseClicked(
                event -> {
                    try {
                        File loadFile = null;
                        if (dir.listFiles() != null) {
                            for (int i = 0; i < dir.listFiles().length; i++) {
                                if (dir.listFiles()[i].getName().equals(textField.getText())) {
                                    loadFile = dir.listFiles()[i];
                                    break;
                                }
                            }
                        }

                        if (loadFile != null) {
                            if (!loadFile.getName().equals("SaveFiles") && !loadFile.getName().equals(" ") && !loadFile.getName().equals("  ") && !loadFile.getName().equals("   ")) {
                                Scanner scanner = new Scanner(loadFile);

                                grid = buildGrid();      /*          удаление всего       */
                                logic.clean();           /*          удаление всего       */
                                border.setCenter(grid);  /*          удаление всего       */

                                int x, y;
                                String chImg;
                                String isShah;
                                String colorStep;

                                isShah = scanner.next();

                                colorStep = scanner.next();


                                while (scanner.hasNext()) {
                                    x = scanner.nextInt();
                                    y = scanner.nextInt();
                                    chImg = scanner.next();

                                    switch (chImg) {
                                        case "a":
                                            if (x != -1 && y != -1)
                                                add(new PawnWhite(findBy(x, y)), grid);
                                            break;
                                        case "b":
                                            if (x != -1 && y != -1)
                                                add(new RookWhite(findBy(x, y)), grid);
                                            break;
                                        case "c":
                                            if (x != -1 && y != -1)
                                                add(new KnightWhite(findBy(x, y)), grid);
                                            break;
                                        case "d":
                                            if (x != -1 && y != -1)
                                                add(new BishopWhite(findBy(x, y)), grid);
                                            break;
                                        case "e":
                                            if (x != -1 && y != -1)
                                                add(new KingWhite(findBy(x, y)), grid);
                                            break;
                                        case "f":
                                            if (x != -1 && y != -1)
                                                add(new QueenWhite(findBy(x, y)), grid);
                                            break;


                                        case "g":
                                            if (x != -1 && y != -1)
                                                add(new PawnBlack(findBy(x, y)), grid);
                                            break;
                                        case "h":
                                            if (x != -1 && y != -1)
                                                add(new RookBlack(findBy(x, y)), grid);
                                            break;
                                        case "i":
                                            if (x != -1 && y != -1)
                                                add(new KnightBlack(findBy(x, y)), grid);
                                            break;
                                        case "j":
                                            if (x != -1 && y != -1)
                                                add(new BishopBlack(findBy(x, y)), grid);
                                            break;
                                        case "k":
                                            if (x != -1 && y != -1)
                                                add(new KingBlack(findBy(x, y)), grid);
                                            break;
                                        case "l":
                                            if (x != -1 && y != -1)
                                                add(new QueenBlack(findBy(x, y)), grid);
                                            break;
                                    }
                                }

                                if (isShah.equals("trueShah")) Logic.isShah = true;
                                if (isShah.equals("falseShah")) Logic.isShah = false;
                                if (colorStep.equals("white")) Logic.count = 0;
                                if (colorStep.equals("black")) Logic.count = 1;
                                scanner.close();
                                loadStage.close();

                            }
                        } else {
                            Text errorText = new Text("File not found");
                            errorText.setFill(Color.RED);
                            errorText.setLayoutX(200);
                            errorText.setLayoutY(98);
                            pane.getChildren().add(errorText);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
    }


    private void refresh(BorderPane border) {
        grid = buildGrid();
        logic.clean();
        border.setCenter(grid);
        buildWhiteTeam(grid);
        buildBlackTeam(grid);
        Logic.isShah = false;
        Logic.isMat = false;
        Logic.count = 0;
        border.getChildren().remove(text); // Надпись о выигрыше
    }

    private void buildWhiteTeam(Group grid) {
        add(new RookWhite(Cell.A1), grid);
        add(new KnightWhite(Cell.B1), grid);
        add(new BishopWhite(Cell.C1), grid);
        add(new KingWhite(Cell.D1), grid);
        add(new QueenWhite(Cell.E1), grid);
        add(new BishopWhite(Cell.F1), grid);
        add(new KnightWhite(Cell.G1), grid);
        add(new RookWhite(Cell.H1), grid);
        add(new PawnWhite(Cell.A2), grid);
        add(new PawnWhite(Cell.B2), grid);
        add(new PawnWhite(Cell.C2), grid);
        add(new PawnWhite(Cell.D2), grid);
        add(new PawnWhite(Cell.E2), grid);
        add(new PawnWhite(Cell.F2), grid);
        add(new PawnWhite(Cell.G2), grid);
        add(new PawnWhite(Cell.H2), grid);
    }

    private void buildBlackTeam(Group grid) {
        add(new PawnBlack(Cell.A7), grid);
        add(new PawnBlack(Cell.B7), grid);
        add(new PawnBlack(Cell.C7), grid);
        add(new PawnBlack(Cell.D7), grid);
        add(new PawnBlack(Cell.E7), grid);
        add(new PawnBlack(Cell.F7), grid);
        add(new PawnBlack(Cell.G7), grid);
        add(new PawnBlack(Cell.H7), grid);
        add(new RookBlack(Cell.A8), grid);
        add(new KnightBlack(Cell.B8), grid);
        add(new BishopBlack(Cell.C8), grid);
        add(new KingBlack(Cell.D8), grid);
        add(new QueenBlack(Cell.E8), grid);
        add(new BishopBlack(Cell.F8), grid);
        add(new KnightBlack(Cell.G8), grid);
        add(new RookBlack(Cell.H8), grid);

    }


    private void add(Figure figure, Group grid) {
        logic.add(figure);
        Cell position = figure.getPosition();
        grid.getChildren().add(buildFigure(position.x * 80 + 10, position.y * 80 + 10, 60, figure.icon()));
    }

    private Cell findBy(double graphX, double graphY) {  // возращает Cell как в перечислении , НЕ КАК НА ДОСКЕ!

        Cell result = null;
        int x = (int) graphX / 80;
        int y = (int) graphY / 80;

        if (graphX == 0 && graphY == 0) return null;

        for (Cell cell : Cell.values()) {
            if (cell.x == x && cell.y == y) {
                result = cell;
                break;
            }
        }
        return result;
    }
}
