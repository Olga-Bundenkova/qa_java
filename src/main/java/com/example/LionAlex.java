package com.example;

import java.util.List;

public class LionAlex extends Lion {
    private static final String HOMELAND = "Нью-Йоркский зоопарк";
    private static final List<String> FRIENDS = List.of("Марти", "Глория", "Мелман");

    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return FRIENDS;
    }

    public String getPlaceOfLiving() {
        return HOMELAND;
    }
}