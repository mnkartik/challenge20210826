package challenge;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ResourceLoader;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootTest(classes = Main.class)
class ProductOrderServiceTest {

    @Autowired
    private ResourceLoader resourceLoader;
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void test() throws Exception {
        File file = resourceLoader.getResource("classpath:product-order.json")
                .getFile();
        byte[] data = Files.readAllBytes(Paths.get(file.toURI()));

        ProductOrder po = mapper.readValue(file, ProductOrder.class);

        System.out.println(po);
    }

}
