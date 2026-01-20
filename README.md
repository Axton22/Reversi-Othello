Reversi Othello proyecto

Descripción:
Nos pusieron como proyecto implementar un juego llamado Reversi othello en Java, cabe recalcar que decidimos implementar dicho juego en consola.
El diseño que implementamos permite jugar partidas de jugador vs jugador y jugador vs CPU, al correr el programa nos saldrá el menú principal el cual indica con 2 opciones enumeradas (1 y 2) que modo de juego desea jugar (jugador vs jugador o jugador vs cpu).
Una vez seleccionado el modo inicia la partida, posterior a esto se mostrará por pantalla el tablero, para dicho tablero establecimos que las celdas marcadas por una 'N' (negro) pertenecerán al jugador que está jugando con las fichas negras mientras que las celdas que están marcadas
por una 'B' (blanco) pertenecen a las fichas del jugador que juega con las fichas blancas, alrededor de las fichas, siempre y cuando haya una jugada disponible aparecerán una serie de carácteres (distintos) que indican que en esa celda hay una jugada dispobible para el jugador actual, 
lo cual a la hora de preguntar ¿En qué casilla desea colocar la ficha? se pueda seleccionar uno de esos carácteres para escoger su movimiento, en caso de seleccionar un carácter inválido se le volverá a hacer la pregunta hasta que seleccione uno válido; todas aquellas casillas sobrantes
estarán representadas por un '_' el cual indica que es una casilla vacía (sin ficha). Una vez entendido lo posterior podrá disfrutar del juego seleccionando en cada turno con un carácter en donde quiere insertar su ficha, el juego finaliza cuando ninguno de los 2 jugadores tenga opción 
de movimiento y ganará aquel jugador que tenga más fichas de su color en el tablero, validamos la opción de que los jugadores quedasen con la misma cantidad de fichas entonces en el caso de que queden con la misma cantidad de fichas, el juego terminará en un empate.

Características:
- Tablero 8x8
- Validación de jugadas
- Volteo automático de fichas
- Juego contra la computadora
- Manejo de turnos
- Contador de fichas

Autores:
Axton Urbina Péres
Daniel Moreno Chavarría
