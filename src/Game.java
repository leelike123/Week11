public class Game {
    public static void main(String[] args) {
        RiotClient riotclient = new RiotClient();
        riotclient.maker = "RiotGames";
        riotclient.start();
        riotclient.openriotclient();
        riotclient.valorant.play();

        riotclient.maker = "RiotGames";
        riotclient.openriotclient();
        riotclient.lol.play();

        riotclient.maker = "RiotGames";
        riotclient.openriotclient();
        riotclient.tft.play();

        /* 오버로딩 */
        BlizzardClient blizzardclient = new BlizzardClient();
        String maker = "블리자드 ";
        blizzardclient.maker = maker;
        blizzardclient.start(maker);
        blizzardclient.overwatch.play();

        blizzardclient.maker = "BlizzardGames";
        blizzardclient.openblizzardclient();
        blizzardclient.hearthstone.play();

        /* 오버라이딩 */
        SteamClient steamclient = new SteamClient();
        steamclient.maker = "Steam";
        steamclient.start();
        steamclient.fc24.play();

        steamclient.maker = "Steam";
        steamclient.opensteamclient();
        steamclient.eternalreturn.play();

        steamclient.maker = "Steam";
        steamclient.opensteamclient();
        steamclient.battleground.play();

        Hoyoplay hoyoplay = new Hoyoplay();
        hoyoplay.maker = "Mihoyo";
        hoyoplay.openhoyoplay();
        hoyoplay.genshinimpact.play();

        hoyoplay.maker = "Mihoyo";
        hoyoplay.openhoyoplay();
        hoyoplay.honkaistarrail.play();
    }
}

class Games {
    String maker;

    void start() {
        System.out.println("PC를 실행합니다.");
    }
    void start(String maker) {
        this.maker = maker;
        System.out.println(maker+"클라이언트를 실행합니다.");

    }
}

class RiotClient extends Games {
    Valorant valorant = new Valorant();
    LoL lol = new LoL();
    TFT tft = new TFT();


    void openriotclient() {
        System.out.println("라이엇 클라이언트를 실행합니다.");
    }
}

class BlizzardClient extends Games {
    Overwatch overwatch = new Overwatch();
    Hearthstone hearthstone = new Hearthstone();

    void openblizzardclient() {
        System.out.println("블리자드 클라이언트를 실행합니다.");
    }
}

class SteamClient extends Games {
    FC24 fc24 = new FC24();
    Eternalreturn eternalreturn = new Eternalreturn();
    Battleground battleground = new Battleground();

    void opensteamclient() {
        System.out.println("스팀 클라이언트를 실행합니다.");
    }
    @Override
    void start() {
        System.out.println("스팀 클라이언트를 실행합니다.");
    }
}

class Hoyoplay extends Games {
    GenshinImpact genshinimpact = new GenshinImpact();
    HonkaiStarrail honkaistarrail = new HonkaiStarrail();

    void openhoyoplay() {
        System.out.println("호요플레이를 실행합니다.");
    }
}
class Valorant {
    void play() {
        System.out.println("발로란트를 실행합니다.");
    }
}
class LoL {
    void play() {
        System.out.println("리그 오브 레전드를 실행합니다.");
    }
}

class TFT {
    void play() {
        System.out.println("전략적 팀 전투를 실행합니다.");
    }
}

class Overwatch {
    void play() {
        System.out.println("오버워치를 실행합니다.");
    }
}

class Hearthstone {
    void play() {
        System.out.println("하스스톤을 실행합니다.");
    }
}

class FC24 {
    void play() {
        System.out.println("FC24를 실행합니다.");
    }
}

class Eternalreturn {
    void play() {
        System.out.println("이터널 리턴을 실행합니다.");
    }
}

class Battleground {
    void play() {
        System.out.println("배틀그라운드를 실행합니다.");
    }
}

class GenshinImpact {
    void play() {
        System.out.println("원신을 실행합니다.");
    }
}

class HonkaiStarrail {
    void play() {
        System.out.println("붕괴:스타레일을 실행합니다.");
    }
}