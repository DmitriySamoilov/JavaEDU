package OOP_sem7.Builder;

import OOP_sem7.Builder.Message;
import OOP_sem7.Builder.MessageBuilder;

public class Main {
    public static void main(String[] args) {
        Message message = new MessageBuilder()
                .setParam1("par1")
                .setParam2("par2")
                .setParam3("par3")
                .build();
    }
}
