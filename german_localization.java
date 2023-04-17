#JSGF V1.0 utf-8 de;

grammar music_play;

public <music_play> =
(ich möchte hören | [Kannst du] (abspielen [mir] | auflegen)) <music_entity>;

<music_entity> =
    <genre> [musik] |
    <album> von <artist> |
    <artist> |
    <song>;

<album> =
    ummagumma;

<genre> =
    jazz;

<artist> =
    beatles |
    radio head |
    cake |
    pink floyd;

<song> =
    confortably numb |
    paranoid android |
    let it be |
    hey jude;