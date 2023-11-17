package br.com.vitalsaude.vital.Model;

import br.com.vitalsaude.vital.consultas.Consulta;
import br.com.vitalsaude.vital.services.ConsultaService;

import java.util.LinkedList;
import java.util.List;

public class ConsultaFila {
        private LinkedList<Consulta> filaDeConsultas;
        private ConsultaService consultaService;

        public ConsultaFila(ConsultaService consultaService) {
            this.consultaService = consultaService;
            filaDeConsultas = new LinkedList<>();
            preencherFilaComConsultas();
        }

        private void preencherFilaComConsultas() {
            List<Consulta> consultasDoBanco = consultaService.buscarConsultasOrdenadasPorData();
            for (Consulta consulta : consultasDoBanco) {
                filaDeConsultas.add(consulta);
            }
        }

        public void adicionarConsulta(Consulta consulta) {
            filaDeConsultas.add(consulta);
        }

        public Consulta removerConsulta() {
            if (filaDeConsultas.isEmpty()) {
                return null;
            }
            return filaDeConsultas.poll();
        }

        public Consulta consultarProximaConsulta() {
            if (filaDeConsultas.isEmpty()) {
                return null;
            }
            return filaDeConsultas.peek();
        }

        public boolean estaVazia() {
            return filaDeConsultas.isEmpty();
        }

        public int tamanho() {
            return filaDeConsultas.size();
        }

    }


