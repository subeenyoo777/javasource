package abstractclass;

public class PlayerEx {
    public static void main(String[] args) {

        // can not instantiate the type Player
        // 인스턴스 생성 불가
        // Player player = new Player() {};
        Player player = new CDPlayer();

        player.play();
        player = new AudioPlayer();
        player.play();

        // print:
        // CD 플레이어
        // Audio 플레이어
    }
}
