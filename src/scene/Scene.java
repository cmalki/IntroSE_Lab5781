package scene;

import geometries.Geometries;
import primitives.Color;

public class Scene {
    private final String _name;

    //according to Dan Zilberstein directives
    public Color background;
    public Color ambientlight;
    public Geometries geometries = null;

    public Scene(String name) {
        _name = name;
        geometries = new Geometries();
    }

    //chaining methods (this NOT a builder pattern)
    public Scene setBackground(Color background) {
        this.background = background;
        return  this;
    }

    public Scene setAmbientlight(Color ambientlight) {
        this.ambientlight = ambientlight;
        return this;
    }

    public Scene setGeometries(Geometries geometries) {
        this.geometries = geometries;
        return  this;
    }
}
