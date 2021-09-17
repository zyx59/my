package Shapea;

public class UnsupportedShapeException extends Exception{
    @Override
    public String toString(){
        return "没有该名称的图形";
    }
}
