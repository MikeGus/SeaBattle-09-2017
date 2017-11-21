package seabattle.game.messages;

import seabattle.msgsystem.Message;

@SuppressWarnings("unused")
public class MsgYouInQueue extends Message {
    private Long id;
    private String nickname;

    public MsgYouInQueue(Long id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
