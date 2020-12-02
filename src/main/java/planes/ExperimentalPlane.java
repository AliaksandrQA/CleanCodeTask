package planes;

import types.ClassificationType;
import types.ExperimentalType;

public class ExperimentalPlane extends Plane{

    private ExperimentalType type;
    private ClassificationType classificationType;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalType type, ClassificationType classificationType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationType = classificationType;
    }

    public ClassificationType getClassificationType(){
        return classificationType;
    }

    public void setClassificationType(ClassificationType classificationType){
        this.classificationType = classificationType;
    }


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
