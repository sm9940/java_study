package ch08.sec04;

public class Audio implements RemoteControl{
    private int volume ; //Audio의 볼륨
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume> RemoteControl.MAX_VOLUME){
            this.volume =RemoteControl.MAX_VOLUME;
        } else if(volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: "+ this.volume);
    }

    private int memoryVolume; //원래 볼륨을 기억

    //public 접근제한자는 반드시 있어야 한다. default는 생략
    @Override
    public void setMute(boolean mute) {
        if(mute){
            //음소거 직전에 기존 볼륨을 저장
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다");
            //무음이 해제되면 원래 볼륨으로 되돌림
            setVolume(this.memoryVolume);
        }
    }
}
