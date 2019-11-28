package studyOCA.oracle_tasks.task0;

public class App61 {
    float screenResolution, width, height;
    public static void main(String[] args) {
            SmartPhone phone = new SmartPhone();
            phone.height = 112.2f;
            phone.width = 56.8f;
            System.out.format("%.0f dpi - %.1f X %.1f",
                    phone.screenResolution, phone.height, phone.width);
    }

    public static class SmartPhone {
        public float width;
        public Object screenResolution;
        public float height;
    }
}
