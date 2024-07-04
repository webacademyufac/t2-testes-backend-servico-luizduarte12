package br.ufac.sgcmapi.model;


import static org.junit.jupiter.api.Assertions.assertEquals;


import java.time.LocalDate;
import java.time.LocalTime;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AtendimentoTest {

    Atendimento atendimento;

    @BeforeEach
    public void setUp(){
        atendimento = new Atendimento();
    }
    @Test
    public void testAtendimentoId(){
        Long id = 1l;
        atendimento.setId(id);
        assertEquals(id,atendimento.getId());
    }
    @Test
    public void TestAtendimentoData(){
        LocalDate data = LocalDate.now();
        atendimento.setData(data);
        assertEquals(data, atendimento.getData());
    }
    @Test
    public void TestAtendimentoHora(){
        LocalTime hora = LocalTime.now();
        atendimento.setHora(hora);
        assertEquals(hora, atendimento.getHora());
    }
    @Test 
    public void TestAtendimentoProfissional(){
        Profissional profissional = new Profissional();
        profissional.setId(1l);
        atendimento.setProfissional(profissional);
        assertEquals(profissional, atendimento.getProfissional());
    }

    @Test
    public void TestAtendimentoPaciente(){
        Paciente paciente = new Paciente();
        paciente.setId(1l);
        atendimento.setPaciente(paciente);
        assertEquals(paciente, atendimento.getPaciente());
    }

    @Test
    public void TestAtendimentoConvenio(){
        Convenio convenio = new Convenio();
        convenio.setId(1l);
        atendimento.setConvenio(convenio);
        assertEquals(convenio, atendimento.getConvenio());
    }


}

