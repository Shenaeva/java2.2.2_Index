public class BmiService {
    /**
     * Считает ИМТ по росту и весу
     * @param height    рост
     * @param weight    вес
     * @return          ИМТ
     */
    public float calculate(float height, float weight) {
        return height / weight;
    }
}
