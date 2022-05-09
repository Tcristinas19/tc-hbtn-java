import exceptions.*;

public class ContaBancariaBasica {

	    private String numeracao;
	        private double saldo = 0;
		    private double taxaJurosAnual;

		        public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
				        this.numeracao = numeracao;
					        this.taxaJurosAnual = taxaJurosAnual;
						    }

			    public String getNumeracao() {
				            return numeracao;
					        }

			        public void setSaldo(double saldo) {
					        this.saldo = saldo;
						    }

				    public double getSaldo() {
					            return saldo;
						        }

				        public double getTaxaJurosAnual() {
						        return taxaJurosAnual;
							    }

					    public void depositar(double valor) throws OperacaoInvalidaException{
						            if (valor > 0){
								                this.saldo = this.saldo + valor;
										        }
							            else {
									                throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
											        }
								        }

					        public void sacar(double valor) throws OperacaoInvalidaException{
							        if (valor <= 0){
									            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
										            }
								        else if (this.saldo < valor) {
										            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
											            }
									        else {
											            this.saldo = this.saldo - valor;
												            }
										    }

						    public double calcularTarifaMensal(){
							            double tarifa = this.saldo * 0.1;

								            if (tarifa > 10){
										                return 10;
												        }
									            else {
											                return tarifa;
													        }
										        }

						        public double calcularJurosMensal(){
								        return this.taxaJurosAnual/12;
									    }

							    public void aplicarAtualizacaoMensal() {
								            this.saldo = this.saldo - calcularTarifaMensal() + this.saldo *(calcularJurosMensal()/100);
									        }
}
