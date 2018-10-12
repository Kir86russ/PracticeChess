package mainFiles;

import figures.Cell;
import figures.Figure;
import figures.black.*;
import figures.white.*;


public class Logic {
    public static Figure sf = null; // Фигуры , которые срубаем
    public static Cell sfPos = null;

    public static Figure currentFig = null; // Фигуры которые ходят (срубают)
    public static Cell currentFigPos = null;

    public static boolean isShah = false;

    public static boolean isMat = false;

    public static int count = 0;

    public Figure[] figures = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        figures[index] = figure;
        index++;
    }

    public boolean move(Cell source, Cell dest) {

        Figure whiteKing = null;
        Figure whiteQueen = null;
        Figure whiteBishop1 = null;
        Figure whiteBishop2 = null;
        Figure whiteKnight1 = null;
        Figure whiteKnight2 = null;
        Figure whiteRook1 = null;
        Figure whiteRook2 = null;
        Figure whitePawn1 = null;
        Figure whitePawn2 = null;
        Figure whitePawn3 = null;
        Figure whitePawn4 = null;
        Figure whitePawn5 = null;
        Figure whitePawn6 = null;
        Figure whitePawn7 = null;
        Figure whitePawn8 = null;

        for (int i = 0; i != figures.length; i++) {
            if (figures[i] != null) {
                if (figures[i].getClass() == KingWhite.class) whiteKing = figures[i];

                if (figures[i].getClass() == QueenWhite.class) whiteQueen = figures[i];

                if (figures[i].getClass() == BishopWhite.class && whiteBishop1 == null) whiteBishop1 = figures[i];
                if (figures[i].getClass() == BishopWhite.class && whiteBishop1.getPosition() != figures[i].getPosition())
                    whiteBishop2 = figures[i];

                if (figures[i].getClass() == KnightWhite.class && whiteKnight1 == null) whiteKnight1 = figures[i];
                if (figures[i].getClass() == KnightWhite.class && whiteKnight1.getPosition() != figures[i].getPosition())
                    whiteKnight2 = figures[i];

                if (figures[i].getClass() == RookWhite.class && whiteRook1 == null) whiteRook1 = figures[i];
                if (figures[i].getClass() == RookWhite.class && whiteRook1.getPosition() != figures[i].getPosition())
                    whiteRook2 = figures[i];

                if (figures[i].getClass() == PawnWhite.class && whitePawn1 == null) {
                    whitePawn1 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnWhite.class && whitePawn2 == null) {
                    whitePawn2 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnWhite.class && whitePawn3 == null) {
                    whitePawn3 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnWhite.class && whitePawn4 == null) {
                    whitePawn4 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnWhite.class && whitePawn5 == null) {
                    whitePawn5 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnWhite.class && whitePawn6 == null) {
                    whitePawn6 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnWhite.class && whitePawn7 == null) {
                    whitePawn7 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnWhite.class && whitePawn8 == null) {
                    whitePawn8 = figures[i];
                    continue;
                }
            }
        }

        Figure blackKing = null;
        Figure blackQueen = null;
        Figure blackBishop1 = null;
        Figure blackBishop2 = null;
        Figure blackKnight1 = null;
        Figure blackKnight2 = null;
        Figure blackRook1 = null;
        Figure blackRook2 = null;
        Figure blackPawn1 = null;
        Figure blackPawn2 = null;
        Figure blackPawn3 = null;
        Figure blackPawn4 = null;
        Figure blackPawn5 = null;
        Figure blackPawn6 = null;
        Figure blackPawn7 = null;
        Figure blackPawn8 = null;

        for (int i = 0; i != figures.length; i++) {
            if (figures[i] != null) {
                if (figures[i].getClass() == KingBlack.class) blackKing = figures[i];

                if (figures[i].getClass() == QueenBlack.class) blackQueen = figures[i];

                if (figures[i].getClass() == BishopBlack.class && blackBishop1 == null) blackBishop1 = figures[i];
                if (figures[i].getClass() == BishopBlack.class && blackBishop1.getPosition() != figures[i].getPosition())
                    blackBishop2 = figures[i];

                if (figures[i].getClass() == KnightBlack.class && blackKnight1 == null) blackKnight1 = figures[i];
                if (figures[i].getClass() == KnightBlack.class && blackKnight1.getPosition() != figures[i].getPosition())
                    blackKnight2 = figures[i];

                if (figures[i].getClass() == RookBlack.class && blackRook1 == null) blackRook1 = figures[i];
                if (figures[i].getClass() == RookBlack.class && blackRook1.getPosition() != figures[i].getPosition())
                    blackRook2 = figures[i];

                if (figures[i].getClass() == PawnBlack.class && blackPawn1 == null) {
                    blackPawn1 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnBlack.class && blackPawn2 == null) {
                    blackPawn2 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnBlack.class && blackPawn3 == null) {
                    blackPawn3 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnBlack.class && blackPawn4 == null) {
                    blackPawn4 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnBlack.class && blackPawn5 == null) {
                    blackPawn5 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnBlack.class && blackPawn6 == null) {
                    blackPawn6 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnBlack.class && blackPawn7 == null) {
                    blackPawn7 = figures[i];
                    continue;
                }
                if (figures[i].getClass() == PawnBlack.class && blackPawn8 == null) {
                    blackPawn8 = figures[i];
                    continue;
                }
            }
        }

        boolean result = false;
        int index = findBy(source);
        if (index != -1) {

            Logic.currentFig = figures[index];
            Logic.currentFigPos = figures[index].getPosition();


            if (isShah && count % 2 == 0 && figures[index].getColor() == "black") {
                System.out.println("ШАХ, ХОДИ БЕЛЫМ КОРОЛЕМ");
                return false;
            }

            if (isShah && count % 2 != 0 && figures[index].getColor() == "white") {
                System.out.println("ШАХ, ХОДИ ЧЕРНЫМ КОРОЛЕМ");
                return false;
            }

            if (count % 2 == 0 && figures[index].getColor() == "white") {

                Cell[] steps = figures[index].way(source, dest, figures);
                if (steps.length > 0) {
                    result = true;
                    figures[index] = figures[index].copy(dest); // Перезаписал фигуру, учтя перемещение (новую координату)
                    count++;

                    if (Logic.isShah) {


                        int countSteps = 0;

                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(blackKing.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                if (Logic.sfPos != null)
                                    Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackQueen != null)
                                if (moveCheck(blackQueen.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackKnight1 != null)
                                if (moveCheck(blackKnight1.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackKnight2 != null)
                                if (moveCheck(blackKnight2.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackBishop1 != null)
                                if (moveCheck(blackBishop1.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackBishop2 != null)
                                if (moveCheck(blackBishop2.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackRook1 != null)
                                if (moveCheck(blackRook1.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackRook2 != null)
                                if (moveCheck(blackRook2.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackPawn1 != null)
                                if (moveCheck(blackPawn1.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackPawn2 != null)
                                if (moveCheck(blackPawn2.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackPawn3 != null)
                                if (moveCheck(blackPawn3.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackPawn4 != null)
                                if (moveCheck(blackPawn4.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackPawn5 != null)
                                if (moveCheck(blackPawn5.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackPawn6 != null)
                                if (moveCheck(blackPawn6.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackPawn7 != null)
                                if (moveCheck(blackPawn7.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (blackPawn8 != null)
                                if (moveCheck(blackPawn8.getPosition(), Cell.values()[i])) {
                                    Logic.currentFig.setPosition(Logic.currentFigPos);
                                    Logic.sf.setPosition(Logic.sfPos);
                                    Logic.isShah = true; 
                                    countSteps++;
                                }
                        }


                        System.out.println("возможных ходов: " + countSteps);
                        if (countSteps == 0) {
                            Logic.isMat = true;
                            System.out.println("МАТ!");
                        }
                    }
                }
            }

            if (count % 2 != 0 && figures[index].getColor() == "black") {
                Cell[] steps = figures[index].way(source, dest, figures);
                if (steps.length > 0) {
                    result = true;
                    figures[index] = figures[index].copy(dest);
                    count++;

                    if (Logic.isShah) {


                        int countSteps = 0;

                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whiteKing.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                if (Logic.sfPos != null)
                                    Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            Cell a = whiteQueen.getPosition();
                            if (moveCheck(whiteQueen.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whiteKnight1.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whiteKnight2.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whiteBishop1.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whiteBishop2.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whiteRook1.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whiteRook2.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whitePawn1.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whitePawn2.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whitePawn3.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whitePawn4.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whitePawn5.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whitePawn6.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whitePawn7.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        for (int i = 0; i != Cell.values().length; i++) {
                            if (moveCheck(whitePawn8.getPosition(), Cell.values()[i])) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                Logic.sf.setPosition(Logic.sfPos);
                                Logic.isShah = true; 
                                countSteps++;
                            }
                        }


                        System.out.println("возможных ходов: " + countSteps);
                        if (countSteps == 0) {
                            Logic.isMat = true;
                            System.out.println("МАТ!");
                        }
                    }
                }

            }


        }
        return result;
    }

    public boolean moveCheck(Cell source, Cell dest) {
        boolean result = false;
        int index = findBy(source);
        if (index != -1) {

            Logic.currentFig = figures[index];
            Logic.currentFigPos = figures[index].getPosition();


            if (isShah && count % 2 == 0 && figures[index].getColor() == "black") {
                System.out.println("ШАХ, ХОДИ БЕЛЫМ КОРОЛЕМ");
                return false;
            }

            if (isShah && count % 2 != 0 && figures[index].getColor() == "white") {
                System.out.println("ШАХ, ХОДИ ЧЕРНЫМ КОРОЛЕМ");
                return false;
            }

            if (count % 2 == 0 && figures[index].getColor() == "white") {
                Cell[] steps = figures[index].way(source, dest, figures);
                if (steps.length > 0) {
                    result = true;
                }

            }

            if (count % 2 != 0 && figures[index].getColor() == "black") {
                Cell[] steps = figures[index].way(source, dest, figures);
                if (steps.length > 0) {
                    result = true;
                }

            }

        }
        return result;
    }

    public void clean() {
        for (int i = 0; i != figures.length; i++) {
            figures[i] = null;
        }
        index = 0;
    }


    private int findBy(Cell cell) {
        int result = -1;
        for (int index = 0; index != figures.length; index++) {
            if (figures[index] != null && figures[index].getPosition().equals(cell)) {
                result = index;
                break;
            }
        }
        return result;
    }
}
