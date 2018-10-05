package com.company;
//Q2 Implement Factory Pattern to get the Polygon of differnt type.

interface Shape{
    void polygonshape();
}


class Triangle implements Shape{

    @Override
    public void polygonshape() {
        System.out.println("You are Drawing Triangle");
    }

}
class Octagan implements Shape{
    @Override
    public void polygonshape() {
        System.out.println("You are Drawing Octagon");
    }
}
class Hexagon implements Shape{
    @Override
    public void polygonshape() {
        System.out.println("You are Drawing Hexagon");
    }
}


class Polygon{
    Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
       this.shape = shape;
    }
}

class PolygonFactory {
    static Polygon getShapeOfPolygon(String name) {
        Polygon p = new Polygon();
        switch (name) {
            case "wantTriangle":
                p.setShape(new Triangle());
                break;
            case "wantHexagon":
                p.setShape(new Hexagon());
                break;
            case "wantOctagan":
                p.setShape(new Octagan());
                break;
        }
        return p;

    }
}
    public class Q2FactoryPattern {
        public static void main(String[] args) {
            Polygon wantTriangle = PolygonFactory.getShapeOfPolygon("wantHexagon");
            wantTriangle.getShape().polygonshape();

        }
    }

