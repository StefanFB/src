package battleship;

enum GameState {
    PREPARATION, START, PLAYING, END
}

enum Preparation {
    PLACE_SHIP_1, PLACE_SHIP_2, PLACE_SHIP_3, PLACE_SHIP_4, PLACE_SHIP_5, PREP_DONE
}

enum LastShot {
    NONE, MISS, HIT, SUNK_SHIP
}
