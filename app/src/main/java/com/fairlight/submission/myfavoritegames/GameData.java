package com.fairlight.submission.myfavoritegames;

import java.util.ArrayList;

public class GameData {

    private static int[] gamePhotos = {
            R.drawable.space_impact,
            R.drawable.wcs_2003,
            R.drawable.ctr,
            R.drawable.sw2,
            R.drawable.midnight_club_3_dub_edition_remix,
            R.drawable.ninja_saga,
            R.drawable.mx_unleashed,
            R.drawable.dw_gundam_2,
            R.drawable.p4,
            R.drawable.p3_fes,
            R.drawable.dmo,
            R.drawable.dota2,
            R.drawable.civ_6
    };

    private static String[] gameNames ={
            "Space Impact",
            "World Championship Snooker 2003",
            "Crash Tag Team Racing",
            "Samurai Warriors 2",
            "Midnight Club 3: DUB Edition Remix",
            "Ninja Saga",
            "MX Unleashed",
            "Dynasty Warriors: Gundam 2",
            "Persona 4",
            "Persona 3 FES",
            "Digimon Masters Online",
            "Dota 2",
            "Sid Meier's Civilization 6"
    };

    private static String[] game_first_impressions = {
            "Who don't know this legendary game?",
            "My first PS2 game, very needed to kill time back then",
            "Press rectangle or square in loading screen",
            "Japanese hack and slash game that makes me interested on learning Japan's History",
            "Interesting racing game with branded cars with powerful special ability",
            "This game enhanced my social skills to a whole new level",
            "A very good off-road racing game with unique vehicles and memorable soundtracks",
            "Gundam Multiverse in a single game",
            "Memories of this game will remain in my heart, forever",
            "One More!",
            "Pay-to-win, but totally worth it",
            "ako mid or feed.",
            "Can you build a civilization, that can stand the test of time?"
    };

    private static String[] game_platforms = {
            "Nokia",
            "PS2",
            "PS2",
            "PS2",
            "PS2",
            "PC",
            "PS2",
            "PS2",
            "PS2",
            "PS2",
            "PC",
            "PC",
            "PC"
    };

    private static String[] game_played_since = {
            "2002",
            "2007",
            "2008",
            "2008",
            "2008",
            "2009",
            "2010",
            "2011",
            "2011",
            "2012",
            "2012",
            "2016",
            "2017"
    };

    private static String[] game_genres = {
            "Shoot 'em up",
            "Sports Game",
            "Racing\nOpen World\nPlatform Game",
            "Hack and Slash",
            "Racing\nOpen World",
            "Role-playing Game",
            "Racing\nOpen World",
            "Hack and Slash",
            "Japanese Role-playing Game\nSocial Simulation Game",
            "Japanese Role-playing Game\nSocial Simulation Game",
            "Massively Multiplayer Online\nRole-playing Game",
            "Multiplayer Online Battle Arena",
            "Turn-based Strategy"
    };

    private static int[] gamePhotosBigSize = {
            R.drawable.big_1_space_impact,
            R.drawable.big_2_wcs2003,
            R.drawable.big_3_ctr,
            R.drawable.big_4_sw2,
            R.drawable.big_5_mc3,
            R.drawable.big_6_ns,
            R.drawable.big_7_mx,
            R.drawable.big_8_dw2,
            R.drawable.big_9_p4,
            R.drawable.big_10_p3,
            R.drawable.big_11_dmo,
            R.drawable.big_12_dota,
            R.drawable.big_13_civ
    };

    private static int[] gamePhotosRound = {
            R.drawable.logo_1_space_impact,
            R.drawable.logo_2_wcs2003,
            R.drawable.logo_3_ctr,
            R.drawable.logo_4_sw2,
            R.drawable.logo_5_mc3,
            R.drawable.logo_6_ns,
            R.drawable.logo_7_mx,
            R.drawable.logo_8_dw2,
            R.drawable.logo_9_p4,
            R.drawable.logo_10_p3,
            R.drawable.logo_11_dmo,
            R.drawable.logo_12_dota,
            R.drawable.logo_13_civ
    };

    private static String[] game_quotes = {
            "\"One of the Greatest Games of ALL Time\" - CNET",
            "\"WCS2003 may not look as good as it could do, but it's got lots to do, with an unlockable John Virgo trickshot challenge, which is ace\" -Eurogamer",
            "\"The racing isn't exactly the star of the show, but Crash Tag Team Racing's supplemental elements pull the whole thing together into a unique and most enjoyable experience\" -GameSpot",
            "\"Return to feudal Japan for more of the same button-mashing mayhem that Koei's been serving up for years.\" -GameSpot",
            "\"More than just a remake, Remix digs up new songs, cars and a level from MC2.\" -IGN",
            "\"Great intro. Customizable avatar. Combat is fun for a little while.\n\" -Gamezebo",
            "\"More fun than the real thing, and you won't die trying.\" -IGN",
            "\"Can giant robots revitalize the Dynasty Warriors series?\" - IGN",
            "\"This stylish role-playing social-simulation game packs a great story, realistic characters, and dozens of hours of enjoyment.\" -GameSpot",
            "\"This is the definitive version of 2007's best role-playing game.\" -GameSpot",
            "\"Welcome to the world of Digimon Masters Online.\" -MMOs.com",
            "\"Dota 2 is complicated, exhausting, and sometimes cruel, but its many complexities form an incredibly satisfying and exciting multiplayer game\" -GameSpot",
            "\"Discovering, decoding, and developing a living world in the best Civilization yet.\" -PC Gamer"
    };

    private static String[] game_developers = {
            "Nokia",
            "Blade Interactive",
            "Radical Entertainment",
            "Omega Force",
            "Rockstar San Diego",
            "Emagist Entertainment Limited",
            "Rainbow Studios",
            "Omega Force",
            "Atlus",
            "Atlus",
            "MoveGames",
            "Valve Corporation",
            "Firaxis Games"
    };

    private static String[] game_available_platforms = {
            "Mobile phone\nJ2ME, Symbian S60\nN-Gage Classic/QD\nN-Gage 2.0",
            "PlayStation 2\nXbox\nMicrosoft Windows",
            "GameCube\nPlayStation 2\nPlayStation Portable\nXbox",
            "PlayStation 2\nXbox 360",
            "PlayStation 2\nXbox",
            "Facebook, with Adobe Flash Player\nAndroid\niOS",
            "PlayStation 2\nXbox",
            "PlayStation 2\nPlayStation 3\nXbox 360",
            "PlayStation 2\nPlayStation Vita",
            "PlayStation 2\nPlayStation Portable",
            "Windows",
            "Windows\nLinus, OS X",
            "Microsoft Windows\nmacOS\nLinux\niOS\nNintendo Switch\nPlayStation 4\nXbox One"
    };

    private static String[] game_release_dates = {
            "1 September 2000",
            "27 June 2003",
            "19 October 2005",
            "23 August 2007",
            "13 March 2006",
            "21 July 2009",
            "17 February 2004",
            "18 December 2008",
            "10 July 2008",
            "19 April 2007",
            "30 October 2009",
            "9 July 2013",
            "21 October 2016"
    };

    private static String[] game_descriptions = {
            "Space Impact is a mobile game series that was published by Nokia and its games usually came bundled with several Nokia devices.\nSpace Impact is a shoot 'em up game and the player has the ability to freely move horizontally and vertically (with a few exceptions on some platform-like levels in Space Impact+) but cannot increase the speed of the screen's auto-scrolling feature. The player can collect power-ups throughout the levels, which award extra lives or special weapons.",
            "World Championship Snooker 2003 is a sports video game developed by Blade Interactive and published by Codemasters for PlayStation 2, Xbox and Microsoft Windows.\nIn comparison to earlier titles, the game was not only Snooker specific, and allowed players to eight-ball and nine-ball pool, and a number of minigames including trick shot, in my pocket, and against the clock.\nThe game was also released with a version specifically designed to play in English pubs and bars. The game involved commentary from both Dennis Taylor and for the first time, John Virgo. John Virgo also lends his name to the unlockable trick shot mode, similar to the one displayed on Big Break.",
            "Crash Tag Team Racing is a racing video game developed by Vancouver-based Radical Entertainment and published by Vivendi Universal Games.\nThe player takes control of Crash Bandicoot, who must retrieve the Black Power Gem of Ebenezer Von Clutch, along with the missing Power Gems in each of the five themed areas of the park. The player will compete in races and minigames to earn Wumpa Coins, the park's currency, and Power Crystals, find the Power Gem needed to open up the five areas of the park, and ultimately unveil the mystery of the Power Gem thief's identity.",
            "Samurai Warriors 2 is a game based on the Sengoku (Warring States) Era of Japan.  While the first Samurai Warriors focused on Nobunaga Oda and earlier battles of this era, Samurai Warriors 2 focuses on battles later on in this era.  The main focus of this game is the Battle of Sekigahara, which was the battle that gave the Tokugawa Army the momentum to be the eventual winners of this era. \nSamurai Warriors 2 is a hack and slash game.  You can choose from one of 26 different characters, each with their own weapon, moves, and personalities.  You help guide that character throughout many of the historic battles of Japan.",
            "Midnight Club 3: Dub Edition is a racing game developed by Rockstar San Diego and published by Rockstar Games. It is the third installment in the Midnight Club series. Like previous installments in the series, the game is an arcade-style racer and focuses on wild, high-speed racing, rather than realistic physics and driving. The name is derived from a partnership between Rockstar and DUB Magazine, which features heavily in the game in the form of DUB-sponsored races and DUB-customized vehicles as prizes.\nPlayers race through open world recreations of San Diego, Atlanta and Detroit listening to 98 (124 in the Remix version) licensed music tracks that include hip-hop, rock, and more. The game features a number of graphical views after the player crashes into certain objects, or travels across particular stretches of road. There is also the ability to customize a player's vehicle. Other than modifying the external looks, the vehicle's performance can also be improved (with the exception of all 'A' Class vehicles except motorcycles). Midnight Club 3: Dub Edition is the first game in the series to feature licensed vehicles.",
            "Ninja Saga is a social ninja game, in which players create their own ninja who lives in a warrior community and fights enemies controlled by artificial intelligence or other players.\nAt the beginning of the game, players choose a name for their character, and its appearance from among 5 options. You also have to choose your two main magic skills that will allow you to cast magic spells.\nOnce you have chosen your character, you can start enjoying everything that Ninja Saga has to offer. You can train against other players, participate in missions in order to win money and experience, upgrade your character's abilities, or even get pets that will help you in different ways.\nNinja Saga's battles are taken in turns. As a result, players have time to chose what type of attack they want for each assault by choosing between different defenses, attacks or magic spells.\nNinja Saga is a social game with RPG components, in which players can enjoy an experience very similar to the one from the Naruto universe. Pretty much all of the game's concepts are directly inspired by the popular anime.",
            "The newest installment of the MX series gives off-road racers more freedom than ever before. Challenge yourself in the freeworld mode - an off-road playground filled with treacherous terrain, minigames and machine races. Work your way up the ranks racing against the top champions in the world on over 40 tracks in 14 separate leagues. Face off against friends in both racing and freestyle modes. Prepare yourself for mud, dirt, high speeds and a serious attitude. If you want more intense action, battle it out with a monster truck, helicopter, or bi-plane!",
            "In the future, rebel space colonies launch a brutal war of independence with a series of coordinated orbital strikes against Earth. The chaotic assault signals the dawn of a new age of combat and the ultimate instrument of warfare is born, the Mobile Suit. Dynasty Warriors: Gundam 2 combines the devastating power of the Mobile Suit, the rich legacy of the Gundam universe and the furious Tactical Action game play of the Dynasty Warriors series. The game thrusts players into incredible battles against legions of enemy Mobile Suits on distant planetary surfaces and in the far reaches of outer space.\nFor the first time, Dynasty Warriors: Gundam 2 lets players engage in melee battles against colossal enemies such as the Psycho Gundam. The massive Psycho Gundam can quickly reconfigure their bodies into titanic mobile fortresses which can move with remarkable speed. However, highly-trained pilots can utilize their own Mobile Suit's speed, agility, and of course firepower to defeat these deadly juggernauts. Dynasty Warriors: Gundam 2 also includes new stories featuring mecha from the latest Gundam anime, plus mecha from Char's Counter Attack and more. With mecha parts collected throughout the course of the game, players can adapt a Mobile Suit which can be piloted into combat.",
            "Persona 4 blends traditional RPG gameplay with simulation elements. The player controls the game's protagonist, a teenage boy who is named by the player, who comes to the town of Inaba for a year.\nThe player-named protagonist is a high-school student who moved into the countryside from the city for a year. During his year-long stay, he becomes involved in investigating mysterious murders while harnessing the power of summoning Persona.\nGameplay is divided between the real world of Inaba, where the protagonist carries out his daily life, and the mysterious \"TV World\", where various dungeons filled with monsters known as Shadows await. With the exception of scripted events, such as plot progression or special events, players can choose to spend their day how they like, be it participating in various real world activities, such as joining school clubs, taking part-time jobs, or reading books, or exploring the TV World's dungeons to gain experience and items.\nFurthermore, some activities and dialogue choices may be limited by the protagonist's five attributes; Understanding, Diligence, Courage, Knowledge, and Expression, which can be increased by performing certain activities that build them.\nWhilst the player is free to choose how to spend their time, if they fail to rescue someone who is trapped in the TV World by the time fog appears in town, which takes place after several days of consecutive rain, that person will get killed by the shadows and the game will end, forcing the player to return to a week prior.\nAs the game progresses, the protagonist forms friendships with other characters known as \"Social Links\", which are each represented by one of the Major Arcana. As these bonds strengthen, the Social Links increase in Rank, which grant bonuses when creating new Personas in the Velvet Room. Additionally, strengthening Social Links with the main party members grant them additional abilities, such as the ability to perform a follow-up attack or an additional ability for their Persona.",
            "In Persona 3, the player takes the role of a male high-school student who joins the Specialized Extracurricular Execution Squad (SEES), a group of students investigating the Dark Hour, a time period between one day and the next that few people are aware of. During the Dark Hour, the player enters Tartarus, a large tower containing Shadows, creatures that feed on the minds of humans. To fight the Shadows, each member of SEES is able to summon a Persona, a manifestation of a person's inner self.\nThe game's most iconic feature is the method by which the members of SEES release their Personas: by firing a gun-like object called an Evoker at their head.\nIn addition to the standard elements of role-playing games, Persona 3 includes elements of simulation games, as the game's protagonist progresses day by day through a school year, making friends and forming relationships that improve the strength of his Personas in battle.\nPersona 3 combines elements of traditional role-playing games and simulation games. The game follows the protagonist character, balancing their daily life of going to school and building relationships with other people with fighting evil beings known as Shadows during the mysterious Dark Hour.\nEach day is divided up between various time zones, the most common of which are \"After School/Daytime\" and \"Evening\". With the exception of scripted events, such as plot progression or special events, the player is free to choose how each day is spent, with most activities causing time to pass on.\nThe types of activities and characters that can be interacted with vary depending on the day of the week and time of day. Additionally, some activities are limited by the protagonist's three attributes; Academics, Charm, and Courage, which can be built by performing various activities or making certain correct choices.\nDuring the evening, players can choose to visit Tartarus, the game's main dungeon, where they can build their party's experience and gain new items. On the day of the full moon, players will participate in a boss battle in order to progress the story.",
            "Digimon Masters is a free-to-play MICROTRANSACTION supported massively multiplayer online role-playing game in a setting based on that of the Digimon media franchise, specifically the universe and characters of the fifth anime series, Digimon Data Squad (though many aspects of Digimon Adventure, Digimon Adventure 02, Digimon Tamers, Digimon Frontier and Digimon Fusion are incorporated).\nPlayers control an avatar of one of the four main Tamers of Digimon Data Squad: Marcus Damon, Thomas H. Norstein, Yoshino Fujieda, and Keenan Crier. The avatar is not meant to represent the actual Tamer, and thus players can choose their own name and modify the appearance of the Avatar. After selecting a Tamer, players are then able to select a Partner Digimon. The Partner Digimon will be used in battle to accomplish NPC-given missions. The player may also hatch new Mercenary Digimon from Digitama dropped by enemy Digimon. Over the course of the game, Partner and Mercenary Digimon will Digivolve into stronger forms (some of which may require special items or quests to unlock) and learn new skills.",
            "Dota 2 is a multiplayer online battle arena (MOBA) video game in which two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.\nAs in Defense of the Ancients, the game is controlled using standard real-time strategy controls, and is presented on a single map in a three-dimensional isometric perspective.\nTen players each control one of the game's 117 playable characters, known as \"heroes\", with each having their own design, strengths, and weaknesses.\nHeroes are divided into two primary roles, known as the core and support. Cores, which are also called \"carries\", begin each match as weak and vulnerable, but are able to become more powerful later in the game, thus becoming able to \"carry\" their team to victory. Supports generally lack abilities that deal heavy damage, instead having ones with more functionality and utility that provide assistance for their carries, such as providing healing and other buffs.\nPlayers select their hero during a pre-game drafting phase, where they can also discuss potential strategies and hero matchups with their teammates. Heroes are removed from the drafting pool and become unavailable for all other players once one is selected, and can not be changed once the drafting phase is over.",
            "Civilization VI is a turn-based strategy video game in which one or more players compete alongside computer-controlled AI opponents to grow their individual civilization from a small tribe to control of the entire planet across several periods of development. This can be accomplished by achieving one of several victory conditions, all based on the 4X gameplay elements, \"eXplore, eXpand, eXploit, and eXterminate\".\nPlayers found cities, gather nearby resources to build and expand them by adding various city improvements, and build military units to explore and attack opposing forces, while managing the technology development, culture, and government civics for their civilization and their diplomatic relationships with the other opponents.\nSimilarly to previous installments, the goal for the player is to develop a civilization from an early settlement through many millennia to become a world power and achieve one of several victory conditions, such as through military domination, technological superiority, or cultural influence, over the other human and computer-controlled opponents. Players do this by exploring the world, founding new cities, building city improvements, deploying military troops to attack and defend from others, researching new technologies and cultural civics, and engaging in trade and negotiations with other world leaders."

    };
    private static int[] gameScreenshots= {
            R.drawable.ss_1_space_impact,
            R.drawable.ss_2_wcs2003,
            R.drawable.ss_3_ctr,
            R.drawable.ss_4_sw2,
            R.drawable.ss_5_mc3,
            R.drawable.ss_6_ns,
            R.drawable.ss_7_mx,
            R.drawable.ss_8_dw2,
            R.drawable.ss_9_p4,
            R.drawable.ss_10_p3,
            R.drawable.ss_11_dmo,
            R.drawable.ss_12_dota,
            R.drawable.ss_13_civ
    };

    static ArrayList<Game> getListData() {
        ArrayList<Game> list = new ArrayList<>();
        for (int position = 0; position < gameNames.length; position++) {
            Game games = new Game();
            games.setPhoto(gamePhotos[position]);
            games.setName(gameNames[position]);
            games.setFirst_impression(game_first_impressions[position]);
            games.setPlayed_since(game_played_since[position]);
            games.setPlatform(game_platforms[position]);
            games.setGenre(game_genres[position]);
            list.add(games);
        }
        return list;
    }

    static ArrayList<Game> getDetailedListData(){
        ArrayList<Game> detailedlist = new ArrayList<>();
        for (int position = 0; position < gameNames.length; position++) {
            Game detailedgame = new Game();
            detailedgame.setPhoto_bigsize(gamePhotosBigSize[position]);
            detailedgame.setPhoto_round(gamePhotosRound[position]);
            detailedgame.setName(gameNames[position]);
            detailedgame.setQuote(game_quotes[position]);
            detailedgame.setDeveloper(game_developers[position]);
            detailedgame.setAvailable_platform(game_available_platforms[position]);
            detailedgame.setRelease_date(game_release_dates[position]);
            detailedgame.setGenre(game_genres[position]);
            detailedgame.setGame_description(game_descriptions[position]);
            detailedgame.setPhoto_game_screenshot(gameScreenshots[position]);
            detailedlist.add(detailedgame);
        }
        return detailedlist;
    }
}
