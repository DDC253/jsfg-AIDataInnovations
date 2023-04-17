# jsfg-AIDataInnovations
NLU challenge for JSFG

# NLU JSGF task

## Task 1: English grammar extension

This was my initial exposure to JSFG, however, after thoroughly reviewing the documentation provided in the attached PDF, I was able to successfully accomplish the task without difficulty.

I categorized the sentences that can be generated into the format of <play_request> <music_entity>, where <play_request> is implicitly defined as (i want to listen to | [can you] (play [me] | put on)).

The expanded grammar, found in [english_extension.java](english_extension.java) can generate the following:

    [can you play]<unk> [beatles]<artist>
    [can you put on]<unk> [paranoid android]<song>
    [i want to listen to]<unk> [jazz]<genre> [music]<unk>
    [play me]<unk> [ummagumma]<album> [by]<unk> [pink floyd]<artist>

As the model is scaled, it is highly likely that the music entities will include phrases like "can you play", "want to listen", and other tokens that should be marked as <unk> and parsed as <music_entity>. In that case, it might be helpful to explicitly define <play_request> and enable the model to recognize both <play_request> and <music_entity>. Additionally, tokens such as [music] and [by] might need to be explicitly defined as well.


## Task 2: German and Spanish localization

### 2.1. Localization

The <play_request> is explicitly defined in both [german_localization.java](german_localization.java) and [spanish_localization.java](spanish_localization.java) localizations.

In the grammar that has been localized to German, some of the terms like genre, album, artist, and song remain in English as they are commonly used in the German language as well.

### 2.2. Sample utterances [^1]: 

The localized grammar is able to generate:


German:

- Ich möchte Jazzmusik hören.
- Kannst du mir "Comfortably Numb" von Pink Floyd abspielen?
- Kannst du Ummagumma von Pink Floyd auflegen?
- Ich möchte Cake hören.
- Kannst du mir "Hey Jude" von den Beatles spielen?
- Kannst du mir Musik von Radiohead auflegen?
- Ich möchte "Let It Be" hören.
- Kannst du mir Musik von Pink Floyd abspielen?
- Ich möchte Jazz hören.
- Kannst du mir ein Lied von Radiohead spielen?

Spanish:

- Quiero escuchar jazz.
- Puedes ponerme la canción Comfortably Numb.
- ¿Puedes reproducir el álbum Ummagumma de Pink Floyd?
- Quiero escuchar música de los Beatles.
- Ponme Let it be.
- ¿Puedes reproducir canciones de Radiohead?
- Quiero escuchar a Cake.
- ¿Puedes poner Pink Floyd?

### 2.3. Difficulties in scaling

If I were asked to extend the JSGF grammar considerably, there are several potential issues that could arise. Here are some possible issues and ways to overcome them:

- Ambiguity: As the grammar becomes more complex and extensive, it is possible for some phrases to become ambiguous, leading to incorrect interpretations. To   overcome this, it is essential to carefully design and test the grammar to ensure that it can accurately identify and parse the intended meaning of each phrase.

- Performance: As the grammar becomes more extensive, it could slow down the performance of the speech recognition system, leading to slower response times. To overcome this, it is important to optimize the grammar's design and structure to make it as efficient as possible while still accurately recognizing the user's intent.

- Scalability: As the number of phrases and rules in the grammar increases, it may become challenging to maintain and update the grammar, especially if multiple people are involved in its development. To overcome this, it is essential to establish clear guidelines for grammar development and maintenance, including version control and testing procedures.

- Compatibility: If the grammar is used with multiple speech recognition systems, there could be compatibility issues that prevent it from working correctly with some systems. To overcome this, it is important to test the grammar thoroughly on all intended platforms to ensure that it works as intended.

- User Experience: As the grammar becomes more extensive, it could become overwhelming for users to remember all the possible phrases and combinations. To overcome this, it is essential to design the user interface in a way that helps guide the user through the available options and make it easy to discover new options gradually.

### 2.4. Language-specific difficulties

The language-specific difficulties in this JSGF grammar for German include:

Word Order: The word order in German is different from English, so the grammar needs to be adjusted accordingly. For example, in the current grammar, the verb "abspielen" can be separated in "ab" and "spielen" where the first one should go at the end of the sentence if it is affermative.

Grammatical Gender: German has three grammatical genders (masculine, feminine, and neuter), which affects the articles and adjectives used with nouns. The current grammar does not account for this and assumes all nouns are masculine.

Synonyms and Variations: German has many synonyms and variations for words and phrases, which can make it challenging to cover all possible variations in the grammar. For example, the phrase "abspielen" is used in the grammar to mean "play", but there are other synonyms like "spielen" and "wiedergeben" that could also be used.

Accents and Pronunciation: German has different accents and pronunciations that could affect the accuracy of speech recognition. The JSGF grammar needs to account for these differences and include variations in the pronunciation of words.

The language-specific difficulties in this JSGF grammar for Spanish include:

One potential difficulty in this grammar for Spanish speakers could be the use of the verb "reproducir," which may not be as commonly used in everyday speech as the English equivalent "play." Additionally, the use of the phrase "puedes poner" to mean "can you put on" may not be as intuitive as "puedes reproducir" to mean "can you play."

Furthermore, some of the artist and song names may be more familiar to English speakers than Spanish speakers, and vice versa, which could impact the ease of recognition and understanding. For example, the artist name "cake" may be more familiar to English speakers, while the artist name "shakira" may be more familiar to Spanish speakers.
