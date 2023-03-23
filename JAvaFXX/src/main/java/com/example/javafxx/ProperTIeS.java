package com.example.javafxx;

import javafx.application.Application;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ProperTIeS {
    public static void main(String[] args) {
        IntegerProperty integerProperty = new SimpleIntegerProperty(5);
        IntegerProperty integerProperty2 = new ReadOnlyIntegerWrapper(5);

        IntegerBinding integerBinding = new IntegerBinding() {
            {
            super.bind(integerProperty, integerProperty2);
            }
            @Override
            protected int computeValue() {
                return integerProperty.get() + integerProperty2.get();
            }
        };
        System.out.println(integerBinding.get());
        integerProperty.set(1);
        System.out.println(integerBinding.get());
        //System.out.println(integerProperty.add(integerProperty2).getValue());
//        integerProperty.addListener(new ChangeListener< Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                System.out.println("new value = " + newValue);
//            }
//        });
//
//        integerProperty.bindBidirectional(integerProperty2);
//        integerProperty2.set(6);
//        System.out.println(integerProperty.get());
//        integerProperty.set(7);
//        System.out.println(integerProperty2.get());
    }
}
class User {
    StringProperty stringProperty = new SimpleStringProperty("Max");

    public String getStringProperty() {
        return stringProperty.get();
    }

    public StringProperty stringPropertyProperty() {
        return stringProperty;
    }

    public void setStringProperty(String stringProperty) {
        this.stringProperty.set(stringProperty);
    }
}

