package cn.liuawen.async;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2018-06-11
 */
public enum EventType {
    LIKE(0),
    COMMENT(1),
    LOGIN(2),
    MAIL(3);

    private int value;

    EventType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
