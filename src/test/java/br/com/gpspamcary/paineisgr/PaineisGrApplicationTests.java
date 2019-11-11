package br.com.gpspamcary.paineisgr;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.pamcary.paineisgr.PaineisGrApplication;
import br.com.pamcary.paineisgr.controller.ViagemMonitoradaController;
@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(classes= {PaineisGrApplication.class})

class PaineisGrApplicationTests {
	@Autowired
	ViagemMonitoradaController oController;
	@Test
	void contextLoads() {
		assertThat(oController).isNotNull();
	}

}
