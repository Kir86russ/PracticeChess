package figures.white;

import mainFiles.Logic;
import figures.Cell;
import figures.Figure;
import figures.black.*;


public class PawnWhite implements Figure {
    private String color = "white";
    private Cell position;

    public PawnWhite(Cell position) {
        this.position = position;
    }


    private boolean controlAttack(Cell cell, Figure[] figures) {
        boolean var = true;

        for (int i = 0; i != figures.length; i++) {
            if (figures[i] != null){
            // ФЕРЗЬ НИЖЕ
            if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            } // СПРАВА ФЕРЗЬ ГОРИЗОНТАЛЬ


            if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                } else var = true;
            }// ФЕРЗЬ СЛЕВА ГОРИЗОНТАЛЬ

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == QueenBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                } else var = true;
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            } // ФЕРЗЬ СНИЗУ ВВЕРХ ВЕРТИКАЛКА


            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == QueenBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            } // ФЕРЗЬ СВЕРХУ ВНИЗ ВЕРТИКАЛКА


            if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == QueenBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            } // ФЕРЗЬ ВЕРХНЯЯ ПРАВАЯ диагонаЛ

            if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == QueenBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            } // ФЕРЗЬ ВЕРХНЯЯ ЛЕВАЯ ДИАГОНАЛЬ

            if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == QueenBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }// ФЕРЗЬ НИЖНЯЯ ЛЕВАЯ ДИАГОНАЛЬ

            if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == QueenBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == QueenBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }// ФЕРЗЬ ПРАВАЯ НИЖНЯЯ ДИАГОНАЛЬ


            // ЛАДЬЯ НИЖЕ
            if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            } // СПРАВА ЛАДЬЯ ГОРИЗОНТАЛЬ


            if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y, figures) == null) {
                    return true;
                } else var = true;
            }// ЛАДЬЯ СЛЕВА ГОРИЗОНТАЛЬ


            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == RookBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                } else var = true;
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            } // ЛАДЬЯ СНИЗУ ВВЕРХ ВЕРТИКАЛКА


            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == RookBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == RookBlack.class) {
                if (findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            } // ЛАДЬЯ СВЕРХУ ВНИЗ ВЕРТИКАЛКА


            // СЛОН НИЖЕ
            if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == BishopBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            } // СЛОН ВЕРХНЯЯ ПРАВАЯ диагонаЛ

            if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == BishopBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y + 3 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y + 4 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y + 5 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y + 6 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y + 7 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y + 6, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y + 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y + 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y + 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y + 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y + 1, figures) == null) {
                    return true;
                }
            } // СЛОН ВЕРХНЯЯ ЛЕВАЯ ДИАГОНАЛЬ

            if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == BishopBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 3 == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 4 == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 5 == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 6 == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x + 7 == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x + 6, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x + 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x + 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x + 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x + 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x + 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }// SLON НИЖНЯЯ ЛЕВАЯ ДИАГОНАЛЬ

            if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == BishopBlack.class) {
                return true;
            }

            if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 3 == cell.x && figures[i].getPosition().y - 3 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 4 == cell.x && figures[i].getPosition().y - 4 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 5 == cell.x && figures[i].getPosition().y - 5 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 6 == cell.x && figures[i].getPosition().y - 6 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }

            if (figures[i].getPosition().x - 7 == cell.x && figures[i].getPosition().y - 7 == cell.y && figures[i].getClass() == BishopBlack.class) {
                if (findByPosition(figures[i].getPosition().x - 6, figures[i].getPosition().y - 6, figures) == null && findByPosition(figures[i].getPosition().x - 5, figures[i].getPosition().y - 5, figures) == null && findByPosition(figures[i].getPosition().x - 4, figures[i].getPosition().y - 4, figures) == null && findByPosition(figures[i].getPosition().x - 3, figures[i].getPosition().y - 3, figures) == null && findByPosition(figures[i].getPosition().x - 2, figures[i].getPosition().y - 2, figures) == null && findByPosition(figures[i].getPosition().x - 1, figures[i].getPosition().y - 1, figures) == null) {
                    return true;
                }
            }// SLON ПРАВАЯ НИЖНЯЯ ДИАГОНАЛЬ

            // ПЕШКА НИЖЕ
            if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == PawnBlack.class)
                return true;
            if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == PawnBlack.class)
                return true;

            // * конь ниже *//
            if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == KnightBlack.class)
                return true;
            if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == KnightBlack.class)
                return true;
            if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y + 2 == cell.y && figures[i].getClass() == KnightBlack.class)
                return true;
            if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y + 1 == cell.y && figures[i].getClass() == KnightBlack.class)
                return true;
            if (figures[i].getPosition().x + 2 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == KnightBlack.class)
                return true;
            if (figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == KnightBlack.class)
                return true;
            if (figures[i].getPosition().x - 2 == cell.x && figures[i].getPosition().y - 1 == cell.y && figures[i].getClass() == KnightBlack.class)
                return true;
            if (figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y - 2 == cell.y && figures[i].getClass() == KnightBlack.class)
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
        Figure whiteKingFigure = null;

        for (int f = 0; f != figures.length; f++) {
            if (figures[f] != null)
            if (figures[f].getClass() == KingWhite.class)
                whiteKingFigure = figures[f];
        }
        Cell[] steps = new Cell[0];                                          // нулевой массив. просто нужен (типо объявили так)

        if (source.y == dest.y - 1 && source.x == dest.x) { // самое стандарное на 1 клетку в передвижение
            if (findByPosition(dest.x, dest.y, figures) == null) {
                if (Logic.isShah) {
                    for (int i = 0; i != figures.length; i++) {  // запомню текущую фигуру в массиве figures
                        if (figures[i].getPosition() == Logic.currentFig.getPosition()) { //
                            Logic.sf = figures[i]; //
                            Logic.sfPos = figures[i].getPosition();
                        }
                    }
                    Logic.currentFig.setPosition(dest);
                    if (!controlAttack(whiteKingFigure.getPosition(), figures)) {
                        Logic.currentFig.setPosition(Logic.currentFigPos);
                        steps = new Cell[]{dest};
                        Logic.isShah = false;
                    }
                    Logic.currentFig.setPosition(Logic.currentFigPos);
                    return steps;
                }
                Logic.currentFig.setPosition(dest);

                if (controlAttack(whiteKingFigure.getPosition(), figures)) {
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

        if (source.y == 1 && dest.y == 3 && source.x == dest.x) { // на 2 клетки вперед хлтьба
            if (findByPosition(dest.x, dest.y, figures) == null) {
                if (Logic.isShah) {
                    for (int i = 0; i != figures.length; i++) {  // запомню текущую фигуру в массиве figures
                        if (figures[i].getPosition() == Logic.currentFig.getPosition()) { //
                            Logic.sf = figures[i]; //
                            Logic.sfPos = figures[i].getPosition();
                        }
                    }
                    Logic.currentFig.setPosition(dest);
                    if (!controlAttack(whiteKingFigure.getPosition(), figures)) {
                        Logic.currentFig.setPosition(Logic.currentFigPos);
                        steps = new Cell[]{dest};
                        Logic.isShah = false;
                    }
                    Logic.currentFig.setPosition(Logic.currentFigPos);
                    return steps;
                }
                Logic.currentFig.setPosition(dest);

                if (controlAttack(whiteKingFigure.getPosition(), figures)) {
                    Logic.currentFig.setPosition(Logic.currentFigPos);
                    return steps;
                }

                Logic.currentFig.setPosition(Logic.currentFigPos);

                for (int i = 0; i != figures.length; i++) {
                    if (figures[i] != null)
                    if (figures[i].getPosition() == dest || (figures[i].getPosition().x == dest.x && figures[i].getPosition().y == dest.y - 1)) {
                        return steps;
                    }
                }
                steps = new Cell[]{dest};
            }
        }

        if (source.y == dest.y - 1 && source.x == dest.x - 1) { // вправо вниз рубка

            if (findByPosition(dest.x, dest.y, figures) != null && findByPosition(dest.x, dest.y, figures).getColor() == "black") {

                if (!Logic.isShah) {
                    Logic.currentFig.setPosition(Cell.X);                               //
                    if (controlAttack(whiteKingFigure.getPosition(), figures)) {        //можно ли сдвинуть пешку
                        Logic.currentFig.setPosition(Logic.currentFigPos);              //
                        return steps;                                                   //
                    }

                    Logic.currentFig.setPosition(Logic.currentFigPos);


                    for (int i = 0; i != figures.length; i++) {
                        if (figures[i] != null)
                        if (figures[i].getPosition() == dest && figures[i].getColor() == "black") {

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
                        if (figures[i].getPosition() == dest && figures[i].getColor() == "black") {
                            Logic.sf = figures[i];
                            Logic.sfPos = figures[i].getPosition();
                            Cell cellBefore = figures[i].getPosition();
                            figures[i].setPosition(Cell.X);
                            Logic.currentFig.setPosition(dest);
                            if (controlAttack(whiteKingFigure.getPosition(), figures)) {
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

        if (source.y == dest.y - 1 && source.x == dest.x + 1) { // вниз влево
            if (findByPosition(dest.x, dest.y, figures) != null && findByPosition(dest.x, dest.y, figures).getColor() == "black") {

                if (!Logic.isShah) {

                    Logic.currentFig.setPosition(Cell.X);                               //
                    if (controlAttack(whiteKingFigure.getPosition(), figures)) {        //можно ли сдвинуть пешку
                        Logic.currentFig.setPosition(Logic.currentFigPos);              //
                        return steps;                                                   //
                    }

                    Logic.currentFig.setPosition(Logic.currentFigPos);


                    for (int i = 0; i != figures.length; i++) {
                        if (figures[i] != null)
                        if (figures[i].getPosition() == dest && figures[i].getColor() == "black") {

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
                        if (figures[i].getPosition() == dest && figures[i].getColor() == "black") {
                            Logic.sf = figures[i];
                            Logic.sfPos = figures[i].getPosition();
                            Cell cellBefore = figures[i].getPosition();
                            figures[i].setPosition(Cell.X);
                            Logic.currentFig.setPosition(dest);
                            if (controlAttack(whiteKingFigure.getPosition(), figures)) {
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
            if (figures[i].getClass() == KingBlack.class && figures[i].getPosition().x - 1 == cell.x && figures[i].getPosition().y - 1 == cell.y) {
                return true;
            }
            if (figures[i] != null)
            if (figures[i].getClass() == KingBlack.class && figures[i].getPosition().x + 1 == cell.x && figures[i].getPosition().y - 1 == cell.y)
                return true;
        }


        return false;
    }


    @Override
    public Figure copy(Cell dest) {
        return new PawnWhite(dest);
    }
}
