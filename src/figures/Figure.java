package figures;

public interface Figure {


    String getColor();   //  возращает цвет фигуры

    Cell getPosition(); //  возращает текующую клетку, которую фигура заниает

    void setPosition(Cell cell);

    Cell[] way(Cell source, Cell dest, Figure[] figures);    /*     way() проверяет,что фигура может так двигаться,
                                                                    если да,то возращает массив клеток по которым пойдет,
                                                                     не смотрит, есть ли на пути преграды */


    default Figure findByPosition(int x, int y, Figure[] figures) {
        for (int i = 0; i != figures.length; i++) {
            if (figures[i] != null) {
                if (figures[i].getPosition().x == x && figures[i].getPosition().y == y)
                    return figures[i];
            }
        }
        return null;
    }






    default String icon() {
        return String.format("%s.png", getClass().getSimpleName());
    }

    Figure copy(Cell dest); // Делает новую фигуру и перезаписывает массив

}
