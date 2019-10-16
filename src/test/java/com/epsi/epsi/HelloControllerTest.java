package com.epsi.epsi;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HelloControllerTest {

    @Test
    public void test1() { //par convention on doit nommer la methode de test par ce qu'elle fait dans ce cas test1 devait être par exemple : sould_return_HelloWorld_when_param_is_null()
        HelloController hellocontroller = new HelloController();
        String resultat = hellocontroller.index(null);

        assertThat(resultat).isEqualTo("HELLO WORLD!!!");
    }
    @Test
    public void test2() { //par convention on doit nommer la methode de test par ce qu'elle fait dans ce cas test1 devait être par exemple : sould_return_Hellotahar_when_param_is_tahar()
        HelloController hellocontroller = new HelloController();
        String resultat = hellocontroller.index("tahar");

        assertThat(resultat).isEqualTo("Hello tahar");
    }

}
