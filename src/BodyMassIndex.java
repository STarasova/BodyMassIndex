public class BodyMassIndex {
    public float calculate(float personsWeight, float personsHeight) {
        var personsHeightSquare = personsHeight * personsHeight;
        float bodyMassIndex = personsWeight / personsHeightSquare ;
        return bodyMassIndex;
    }
}
