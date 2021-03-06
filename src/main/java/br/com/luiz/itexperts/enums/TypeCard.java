package br.com.luiz.itexperts.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TypeCard {

    DEBIT_CARD,
    CREDIT_CARD,
    MEAL_CARD,
    GIFT_CARD;

    @JsonCreator
    public static TypeCard fromString(String name) {
        for(TypeCard type : TypeCard.values()) {
            if(name.toUpperCase().contains(type.name().substring(0, 4))) {
                return type;
            }
        }
        return null;
    }

}
