package figures.black;

import mainFiles.Logic;
import figures.Cell;
import figures.Figure;
import figures.white.*;


public class PawnBlack implements Figure {
    private String color = "black";
    private Cell position;

    public PawnBlack(Cell position) {
        this.position = position;
    }


    private boolean controlAttack(Cell cell, Figure[] figures) {
        boolean var = true;

        for (int i = 0; i != figures.length; i++) {
            if (figures[i] != null){
                // ФЕРЗЬ НИЖЕ
                if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                } // СПРАВА ФЕРЗЬ ГОРИЗОНТАЛЬ


                if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    } else var = true;
                }// ФЕРЗЬ СЛЕВА ГОРИЗОНТАЛЬ

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    } else var = true;
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                } // ФЕРЗЬ СНИЗУ ВВЕРХ ВЕРТИКАЛКА


                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                } // ФЕРЗЬ СВЕРХУ ВНИЗ ВЕРТИКАЛКА


                if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                } // ФЕРЗЬ ВЕРХНЯЯ ПРАВАЯ диагонаЛ

                if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                } // ФЕРЗЬ ВЕРХНЯЯ ЛЕВАЯ ДИАГОНАЛЬ

                if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }// ФЕРЗЬ НИЖНЯЯ ЛЕВАЯ ДИАГОНАЛЬ

                if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == QueenWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }// ФЕРЗЬ ПРАВАЯ НИЖНЯЯ ДИАГОНАЛЬ


                // ЛАДЬЯ НИЖЕ
                if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                } // СПРАВА ЛАДЬЯ ГОРИЗОНТАЛЬ


                if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                        return true;
                    } else var = true;
                }// ЛАДЬЯ СЛЕВА ГОРИЗОНТАЛЬ


                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == RookWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    } else var = true;
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                } // ЛАДЬЯ СНИЗУ ВВЕРХ ВЕРТИКАЛКА


                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == RookWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == RookWhite.class) {
                    if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                } // ЛАДЬЯ СВЕРХУ ВНИЗ ВЕРТИКАЛКА


                // СЛОН НИЖЕ
                if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                } // СЛОН ВЕРХНЯЯ ПРАВАЯ диагонаЛ

                if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                        return true;
                    }
                } // СЛОН ВЕРХНЯЯ ЛЕВАЯ ДИАГОНАЛЬ

                if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }// SLON НИЖНЯЯ ЛЕВАЯ ДИАГОНАЛЬ

                if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    return true;
                }

                if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }

                if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == BishopWhite.class) {
                    if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                        return true;
                    }
                }// SLON ПРАВАЯ НИЖНЯЯ ДИАГОНАЛЬ

                // ПЕШКА НИЖЕ
                if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == PawnWhite.class)
                    return true;
                if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == PawnWhite.class)
                    return true;

                // * конь ниже *//
                if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == KnightWhite.class)
                    return true;
                if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == KnightWhite.class)
                    return true;
                if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == KnightWhite.class)
                    return true;
                if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == KnightWhite.class)
                    return true;
                if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == KnightWhite.class)
                    return true;
                if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == KnightWhite.class)
                    return true;
                if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == KnightWhite.class)
                    return true;
                if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == KnightWhite.class)
                    return true;

            }
        }

        return false;
    }

    @Override
    public void setPosition(Cell position) {
        this.position = position;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Cell getPosition() {
        return position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest, Figure[] figures) {
        Figure blackKingFigure = null;

        for (int f = 0; f != figures.length; f++) {
            if (figures[f] != null)
                if (figures[f].getClass() == KingBlack.class) {
                    blackKingFigure = figures[f];
                    break;
                }
        }
        
        Cell[] steps = new Cell[0];                                          // нулевой массив. просто нужен (типо объявили так)

        if (source.y == dest.y + 1 && source.x == dest.x) { // самое стандарное на 1 клетку в передвижение
            if (findByPosition(dest.x, dest.y, figures) == null) {
                if (Logic.isShah) {
                    for (int i = 0; i != figures.length; i++) {  // запомню текущую фигуру в массиве figures
                        if (figures[i] != null)
                        if (figures[i].getPosition() == Logic.currentFig.getPosition()) { //
                            Logic.sf = figures[i]; //
                            Logic.sfPos = figures[i].getPosition();
                        }
                    }
                    Logic.currentFig.setPosition(dest);
                    if (!controlAttack(blackKingFigure.getPosition(), figures)) {
                        Logic.currentFig.setPosition(Logic.currentFigPos);
                        steps = new Cell[]{dest};
                        Logic.isShah = false;
                    }
                    Logic.currentFig.setPosition(Logic.currentFigPos);
                    return steps;
                }
                Logic.currentFig.setPosition(dest);

                if (controlAttack(blackKingFigure.getPosition(), figures)) {
                    Logic.currentFig.setPosition(Logic.currentFigPos);
                    return steps;
                }

                Logic.currentFig.setPosition(Logic.currentFigPos);

                for (int i = 0; i != figures.length; i++) {
                    if (figures[i] != null)
                        if (figures[i].getPosition() == dest) {
                            return steps;
                        }
                }
                steps = new Cell[]{dest};
            }
        }

        if (source.y == 6 && dest.y == 4 && source.x == dest.x) { // на 2 клетки вперед ходьба
            if (findByPosition(dest.x, dest.y, figures) == null) {
                if (Logic.isShah) {
                    for (int i = 0; i != figures.length; i++) {  // запомню текущую фигуру в массиве figures
                        if (figures[i] != null)
                        if (figures[i].getPosition() == Logic.currentFig.getPosition()) { //
                            Logic.sf = figures[i]; //
                            Logic.sfPos = figures[i].getPosition();
                        }
                    }
                    Logic.currentFig.setPosition(dest);
                    if (!controlAttack(blackKingFigure.getPosition(), figures)) {
                        Logic.currentFig.setPosition(Logic.currentFigPos);
                        steps = new Cell[]{dest};
                        Logic.isShah = false;
                    }
                    Logic.currentFig.setPosition(Logic.currentFigPos);
                    return steps;
                }
                Logic.currentFig.setPosition(dest);

                if (controlAttack(blackKingFigure.getPosition(), figures)) {
                    Logic.currentFig.setPosition(Logic.currentFigPos);
                    return steps;
                }

                Logic.currentFig.setPosition(Logic.currentFigPos);

                for (int i = 0; i != figures.length; i++) {
                    if (figures[i] != null)
                        if (figures[i].getPosition() == dest || (figures[i].getPosition().x == dest.x && figures[i].getPosition().y == dest.y + 1)) {
                            return steps;
                        }
                }
                steps = new Cell[]{dest};
            }
        }

        if (source.y == dest.y + 1 && source.x == dest.x - 1) { // вправо вверх рубка

            if (findByPosition(dest.x, dest.y, figures) != null && findByPosition(dest.x, dest.y, figures).getColor() == "white") {

                if (!Logic.isShah) {
                    Logic.currentFig.setPosition(Cell.X);                               //
                    if (controlAttack(blackKingFigure.getPosition(), figures)) {        //можно ли сдвинуть пешку
                        Logic.currentFig.setPosition(Logic.currentFigPos);              //
                        return steps;                                                   //
                    }

                    Logic.currentFig.setPosition(Logic.currentFigPos);


                    for (int i = 0; i != figures.length; i++) {
                        if (figures[i] != null)
                            if (figures[i].getPosition() == dest && figures[i].getColor() == "white") {

                                figures[i].setPosition(Cell.X);

                                steps = new Cell[]{dest};

                            }
                    }

                    if (checkShah(dest, figures)) {     //
                        Logic.isShah = true;            //  проверка на шах ЧЕРНЫМ уже
                    }                                   //

                    return steps;
                }

                if (Logic.isShah) {
                    for (int i = 0; i != figures.length; i++) {
                        if (figures[i].getPosition() == dest && figures[i].getColor() == "white") {
                            Logic.sf = figures[i];
                            Logic.sfPos = figures[i].getPosition();
                            Cell cellBefore = figures[i].getPosition();
                            figures[i].setPosition(Cell.X);
                            Logic.currentFig.setPosition(dest);
                            if (controlAttack(blackKingFigure.getPosition(), figures)) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                figures[i].setPosition(cellBefore);
                                return steps;
                            } else {
                                steps = new Cell[]{dest};
                                Logic.isShah = false;
                                if (checkShah(dest, figures)) {
                                    Logic.isShah = true;
                                }
                                return steps;
                            }
                        }
                    }
                }


            } else return steps;
        }

        if (source.y == dest.y + 1 && source.x == dest.x + 1) { // вверх влево
            if (findByPosition(dest.x, dest.y, figures) != null && findByPosition(dest.x, dest.y, figures).getColor() == "white") {

                if (!Logic.isShah) {

                    Logic.currentFig.setPosition(Cell.X);                               //
                    if (controlAttack(blackKingFigure.getPosition(), figures)) {        //можно ли сдвинуть пешку
                        Logic.currentFig.setPosition(Logic.currentFigPos);              //
                        return steps;                                                   //
                    }

                    Logic.currentFig.setPosition(Logic.currentFigPos);


                    for (int i = 0; i != figures.length; i++) {
                        if (figures[i] != null)
                            if (figures[i].getPosition() == dest && figures[i].getColor() == "white") {

                                figures[i].setPosition(Cell.X);

                                steps = new Cell[]{dest};

                            }
                    }

                    if (checkShah(dest, figures)) {     //
                        Logic.isShah = true;            //  проверка на шах ЧЕРНЫМ уже
                    }                                   //

                    return steps;
                }

                if (Logic.isShah) {
                    for (int i = 0; i != figures.length; i++) {
                        if (figures[i].getPosition() == dest && figures[i].getColor() == "white") {
                            Logic.sf = figures[i];
                            Logic.sfPos = figures[i].getPosition();
                            Cell cellBefore = figures[i].getPosition();
                            figures[i].setPosition(Cell.X);
                            Logic.currentFig.setPosition(dest);
                            if (controlAttack(blackKingFigure.getPosition(), figures)) {
                                Logic.currentFig.setPosition(Logic.currentFigPos);
                                figures[i].setPosition(cellBefore);
                                return steps;
                            } else {
                                steps = new Cell[]{dest};
                                Logic.isShah = false;
                                if (checkShah(dest, figures)) {
                                    Logic.isShah = true;
                                }
                                return steps;
                            }
                        }
                    }
                }
            } else return steps;
        }


        if (checkShah(dest, figures)) {
            Logic.isShah = true;
        }
        return steps;
    }

    private boolean checkShah(Cell cell, Figure[] figures) {

        for (int i = 0; i != figures.length; i++) {
            if (figures[i] != null)
                if (figures[i].getClass() == KingWhite.class && figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y - 1 == cell.y) {
                    return true;
                }
            if (figures[i] != null)
                if (figures[i].getClass() == KingWhite.class && figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y - 1 == cell.y)
                    return true;
        }


        return false;
    }


    @Override
    public Figure copy(Cell dest) {
        return new PawnBlack(dest);
    }
}