package com.emu.javafxcodedcontrols.logic;

import java.util.Arrays;

public class MessageService {
    public String transferToSingleSternianer(String text) {
        return String.join("*", text.split(""));
    }
}
