#JSGF V1.0 utf-8 en;

grammar music_play;

public <music_play> =
(i want to listen to | [can you] (put on | play [me])) <music_entity>; 


<music_entity> =
    <genre> [music] |
    <album> by <artist> |
    <artist> |
    <song>;

<album> = 
    ummagamma;

<genre> = 
    jazz;

<artist> =
    the beatles |
    radiohead |
    lady gaga |
    pink floyd;

<song> =
    comfortably numb |
    paranoid android |
    let it be |
    hey jude;

