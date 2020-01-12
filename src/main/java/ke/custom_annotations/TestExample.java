package ke.custom_annotations;

@TesterInfo(
        priority = TesterInfo.Priority.HIGH,
        createdBy = "olnester.com",
        tags = {"sales", "test"}
)

public class TestExample {
    @Test
    void testA() {
        if (true) {
            throw new RuntimeException("This test always failed");
        }
    }

    @Test(enabled = false)
    public void testB() {
        if (false) {
            throw new RuntimeException("This test always passed");
        }
    }

    @Test(enabled = true)
    public void testC() {
        if (10 > 1) {
            System.out.println("This test always passed");
        }
    }
}