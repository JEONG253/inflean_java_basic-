package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void volumeUp(){
        volume++;
        System.out.println("현재 볼룸 = " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("현재 볼룸 = " + volume);
    }

    void status(){
        if(isOn){
            System.out.println("플레이어 ON, 현재 볼륨: " +volume);
        }else {
            System.out.println("플레이어 OFF ");
        }
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 시작합니다.");
    }

}
