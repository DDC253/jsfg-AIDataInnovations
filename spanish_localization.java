#JSGF V1.0 utf-8 es;

grammar music_play;

public <reproducir_musica> =
(quiero escuchar | [puedes] (reproducir [me] | poner)) <entidad_musical>;

<entidad_musical> =
    <genero> [musica] |
    <album> de <artista> |
    <artista> |
    <cancion>;

<album> =
    ummagumma;

<genero> =
    jazz;

<artista> =
    beatles |
    radio head |
    cake |
    pink floyd;

<cancion> =
    confortably numb |
    paranoid android |
    let it be |
    hey jude;