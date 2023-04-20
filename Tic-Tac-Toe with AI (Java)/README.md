# Tic-Tac-Toe with AI (Java)
## Learning Outcomes
After finishing this project, you'll get to know a lot about planning and developing a complex program from scratch, using classes and methods, handling errors, and processing user input. You will also learn to use OOP (Object-Oriented Programming) in the process.

## About
Everybody remembers this paper-and-pencil game from childhood: Tic-Tac-Toe, also known as Noughts and crosses or Xs and Os. A single mistake usually costs you the game, but thankfully it is simple enough that most players discover the best strategy quickly. Let’s program Tic-Tac-Toe and get playing!

---

## Stage 1
### Objectives

The program should work in the following way:

1. Ask the user to provide the initial state of the 3x3 table with the first input line. This must include nine symbols that can be `X`, `O`or `_` (the latter represents an empty cell).
2. Output the specified 3x3 table before the user makes a move.
3. Request that the user enters the coordinates of the move they wish to make.
4. The user then inputs two numbers representing the cell in which they wish to place their `X` or `O`. The game always starts with `X`, so the user's move should be made with this symbol if there are an equal number of `X`'s and `O`'s in the table. If the table contains an extra `X`, the move should be made with `O`.
5. Analyze the user input and show messages in the following situations:
    * `This cell is occupied! Choose another one!` — if the cell is not empty;
    * `You should enter numbers!` — if the user tries to enter letters or symbols instead of numbers;
    * `Coordinates should be from 1 to 3!` — if the user attempts to enter coordinates outside of the table's range.
6. Display the table again with the user's most recent move included.
7. Output the state of the game.

The possible states are:

* `Game not finished` — when no side has three in a row, but the table still has empty cells;
* `Draw` — when no side has three in a row, and the table is complete;
* `X wins` — when there are three `X`'s in a row (up, down, across, or diagonally);
* `O wins` — when there are three `O`'s in a row (up, down, across, or diagonally).

If the user provides invalid coordinates, the program should repeat the request until numbers that represent an empty cell on the table are supplied. You should ensure that the program only outputs the table twice — before the move and after the user makes a legal move.

---

## Stage 2
### Objectives
In this stage, you should implement the following:

* Display an empty table when the program starts.
* The user plays first as `X`, and the program should ask the user to enter cell coordinates.
* Next, the computer makes its move as `O`, and the players then move in turn until someone wins or the game results in a draw.
* Print the final outcome at the very end of the game.

---

## Stage 3
### Objectives
Your tasks for this stage are:

1. Write a menu loop, which can interpret two commands: `start` and `exit`.
2. Implement the command `start`. It should take two parameters: who will play `X` and who will play `O`. Two options are possible for now: `user` to play as a human, and `easy` to play as an AI.
3. The `exit` command should simply end the program.
4. In later steps, you will add the `medium` and `hard` levels.

Don't forget to handle incorrect input! The message `Bad parameters!` should be displayed if what the user enters is invalid.

---