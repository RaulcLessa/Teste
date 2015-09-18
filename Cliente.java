package T02;

import java.text.*;
import java.util.*;

public class Cliente {
	private String celular, telFixo, timeFutebol, estadoCivil;
	private boolean valido;
	private String salario;
	private String logradouro;
	private String numero;
	private String CPF;
	private String CNPJ;
	private String cidade;
	private String cep;
	private String data;
	private String cnpj;
	private String nomeCompleto;
	private String sobreNome;
	private String sexo;
	private String profissao;
	private String RG;
	private String tipoPessoa;
	private String tipoEmail;
	private String UF, Referencia, InfoAdicionais;
	private float Montante;
	private int dia, mes, ano;
	private String comp;
	private String bairro;
	private String cpf;
	private int ID;
	private static int contID = 0;

	public Cliente() {
	}

	public Cliente(String salario, String logradouro, String numero,
			String tipoPessoa, String CPF, String CNPJ, String celular,
			String telFixo, String timeFutebol, String estadoCivil,
			String cidade, String cep, String data, String cnpj, String UF,
			String Referencia, int ID) {
		this.setSalario(salario);
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setTipoPessoa(tipoPessoa);
		this.setCelular(celular);
		this.setTelFixo(telFixo);
		this.setTimeFutebol(timeFutebol);
		this.setEstadoCivil(estadoCivil);
		this.setCidade(cidade);
		this.setCep(cep);
		this.setDataNasc(data);
		this.setCnpj(cnpj);
		this.UF = UF;
		this.Referencia = Referencia;
		this.ID = ID;
		this.comp = comp;
		this.bairro = bairro;
		this.cpf = cpf;
	}

	//Incrementa ID - Raul
	
	public void incrementaID(){
		this.ID = contID;
		contID++;
	}
	
	// MÈtodos GUILHERME
	public boolean setCelular(String celular) {
		valido = false;

		if (celular.compareTo("") == 0) {
			valido = true;
			this.celular = celular;
		} else if (celular.matches("\\d{10,11}") == true) {
			valido = true;
			this.celular = celular;
		} else {
			valido = false;
		}
		return valido;

	}

	public boolean setTelFixo(String telFixo) {
		valido = false;

		if (telFixo.compareTo("") == 0) {
			valido = true;
			this.telFixo = telFixo;
		} else if (telFixo.matches("\\d{10}") == true) {
			valido = true;
			this.telFixo = telFixo;

		} else {
			valido = false;
		}
		return valido;

	}

	public boolean setTimeFutebol(String timeFutebol) {
		valido = false;

		if (timeFutebol.compareTo("") == 0) {
			valido = true;
			this.timeFutebol = timeFutebol;
		} else if ((timeFutebol.length() <= 50)
				&& (timeFutebol
						.matches("^[A-Za-z·‡‚„ÈËÍÌÔÛÙıˆ˙ÁÒ¡¿¬√…»Õœ”‘’÷⁄«— ]+$") == true)) {
			valido = true;
			this.timeFutebol = timeFutebol;

		} else {
			valido = false;
		}
		return valido;

	}

	public boolean setEstadoCivil(String estadoCivil) {
		valido = false;

		if (estadoCivil.compareTo("") == 0) {
			valido = true;
			this.estadoCivil = estadoCivil;
		} else if ((estadoCivil.length() <= 50)
				&& (estadoCivil
						.matches("^[A-Za-z·‡‚„ÈËÍÌÔÛÙıˆ˙ÁÒ¡¿¬√…»Õœ”‘’÷⁄«— ]+$") == true)) {
			valido = true;
			this.estadoCivil = estadoCivil;
		} else {
			valido = false;
		}
		return valido;

	}

	public String getCelular() {
		if (celular.compareTo("") == 0) {
			return this.celular;
		} else if (celular.length() == 10) {
			this.celular = ("(" + celular.charAt(0) + celular.charAt(1) + ")"
					+ " " + celular.substring(2, 6) + "-" + celular.substring(
					6, 10));
		}

		else {
			this.celular = ("(" + celular.charAt(0) + celular.charAt(1) + ")"
					+ " " + celular.substring(2, 7) + "-" + celular.substring(
					7, 11));
		}

		return this.celular;
	}

	public String getTelFixo() {
		if (telFixo.compareTo("") == 0) {
			return this.telFixo;
		} else if (telFixo.length() == 10) {
			this.telFixo = ("(" + telFixo.charAt(0) + telFixo.charAt(1) + ")"
					+ " " + telFixo.substring(2, 6) + "-" + telFixo.substring(
					6, 10));
		}
		return this.telFixo;

	}

	public String getTimeFutebol() {
		return this.timeFutebol.toUpperCase();
	}

	public String getEstadoCivil() {
		return this.estadoCivil.toUpperCase();
	}

	// fim M…TODOS GUILHERME

	// M…TODOS RAUL
	public boolean setCPF(String CPF) {

		valido = CPF.matches("\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}");
		if (valido == true) {
			this.CPF = CPF;
		}

		return valido;
	}

	public String getCPF() {
		return this.CPF;
	}

	public boolean setCNPJ(String CNPJ) {

		valido = CNPJ.matches("\\d{2}\\.?\\d{3}\\.?\\d{3}/?\\d{4}-?\\d{2}");
		if (valido == true) {
			this.CNPJ = CNPJ;
		}
		return valido;
	}

	public String getCNPJ() {
		return this.CNPJ;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getTipoPessoa() {
		return this.tipoPessoa;
	}

	public boolean setSalario(String salario) {
		int numeroInt;

		valido = salario.matches("\\d+");
		if (valido == true) {

			numeroInt = Integer.parseInt(salario);
			if (numeroInt < 788) {
				this.salario = "Menor que um sal·rio mÌnimo.";
			} else if ((numeroInt > 788) && (numeroInt < 2364)) {
				this.salario = "Entre 1 e 3 sal·rios mÌnimos.";
			} else if ((numeroInt > 2364) && (numeroInt < 3940)) {
				this.salario = "Entre 3 e 5 sal·rios mÌnimos.";
			} else if (numeroInt > 3940) {
				this.salario = "Maior que 5 sal·rios mÌnimos.";
			}
		}

		return valido;
	}

	public String getSalario() {
		return this.salario;
	}

	public boolean setLogradouro(String logradouro) {

		valido = logradouro.matches("([\\w\\s ]{1,50})");
		if (valido == true) {
			this.logradouro = logradouro;
		}

		return valido;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public boolean setNumero(String numero) {

		if (numero.matches("\\d+")) {
			valido = true;
			this.numero = numero;

		} else {
			valido = false;
		}

		return valido;
	}

	public String getNumero() {
		return this.numero;
	} // FIM M…TODOS RAUL

	// M…TODOS JEAN

	public String getCidade() {
		return this.cidade;
	}

	public boolean setCidade(String cidade) {
		boolean VC = cidade.matches("^([a-zA-Z·ÈÌÛ¡…Õ”⁄„ı√’¬ ‚ÍÙ‘] ?){3,50}+");
		if (VC == true) {
			this.cidade = cidade;
		}
		return VC;
	}

	public String getCep() {
		return this.cep;
	}

	public boolean setCep(String cep) {
		boolean result = cep.matches("\\d{5}.\\d{3}");
		if (result == true) {
			this.cep = cep;
		}
		return result;
	}

	public String getData() {
		return this.data;
	}

	public boolean setDataNasc(String data) {

		if (data == null || data.equals(""))
			return false;

		try {
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			formatter.setLenient(false); // se tolerancia se a data for inv·lida
			// retorna erro ex:31/02/2009

			java.util.Date dataMinima = formatter.parse("01/01/1900");
			java.util.Date dataMaxima = formatter.parse("31/12/2005");
			java.util.Date dataParam = formatter.parse(data);

			// comparando perÌodo v·lido
			if ((dataParam.before(dataMinima)) || (dataParam.after(dataMaxima))) {
				return false;
			} else {
				this.data = data;
				return true;
			}
		} catch (ParseException erro) {
			return false;
		}
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public boolean setCnpj(String CNPJ) {
		// remove mascara de cnpj
		CNPJ = CNPJ.replaceAll("\\D", "");

		// considera-se erro CNPJ com menos de 14 caracteres
		if (CNPJ.length() != 14) {
			return (false);
		}
		char dig13, dig14;
		int sm, i, r, num, peso;
		// "try" - protege o cÛdigo para eventuais erros de conversao de tipo
		// (int)

		try { // Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 2;
			for (i = 11; i >= 0; i--) { // converte o i-Èsimo caractere do CNPJ
				// em um n˙mero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 È a posiÁ„o de '0' na tabela ASCII)
				num = (int) (CNPJ.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;

				if (peso == 10)
					peso = 2;
			}
			r = sm % 11;

			if ((r == 0) || (r == 1))
				dig13 = '0';

			else
				dig13 = (char) ((11 - r) + 48); // Calculo do 2o. Digito
			// Verificador
			sm = 0;
			peso = 2;

			for (i = 12; i >= 0; i--) {
				num = (int) (CNPJ.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;

			}
			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig14 = '0';

			else {
				dig14 = (char) ((11 - r) + 48); // Verifica se os dÌgitos
			} // calculados conferem com os
				// dÌgitos informados.

			if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
				this.cnpj = CNPJ;
				return true;

			} else {
				return (false);
			}
		} catch (InputMismatchException erro) {
			return (false);
		}

	}

	public String imprimeCNPJ(String CNPJ) { // m·scara do CNPJ:
		// 99.999.999.9999-99
		return (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "."
				+ CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" + CNPJ
					.substring(12, 14));
	} // FIM M…TODOS JEAN

	// M…TODOS DIONAT√
	public boolean setNome(String nome) {
		boolean validaNome = nome
				.matches("^[a-zA-Z¡¿·‡¬‚√„ÁÈË…»Í ÌÕÛÚ”“Ù‘ı’˙⁄¸‹]{1,50}+");
		if (validaNome == true) {
			this.nomeCompleto = nome;
		}
		return validaNome;
	}

	public boolean setSobreNome(String sobreNome) {
		boolean validaSobreNome = sobreNome
				.matches("[a-zA-Z¡¿·‡¬‚√„ÁÈË…»Í ÌÕÛÚ”“Ù‘ı’˙⁄¸‹ ]{1,50}");
		if (validaSobreNome == true) {
			this.sobreNome = sobreNome;
		}
		return validaSobreNome;
	}

	public boolean setSexo(String sexo) {
		boolean validaSexo = sexo.compareToIgnoreCase("Masculino") == 0
				|| sexo.compareToIgnoreCase("Feminino") == 0;
		if (validaSexo == true) {
			this.sexo = sexo;
		}
		return validaSexo;
	}

	public boolean setProfissao(String profissao) {
		boolean validaProfissao = profissao
				.matches("^([a-zA-Z¡¿·‡¬‚√„ÁÈË…»Í ÌÕÛÚ”“Ù‘ı’˙⁄¸‹] ?){3,50}");
		if (validaProfissao == true) {
			this.profissao = profissao;
		}
		return validaProfissao;
	}

	public boolean setRG(String RG) {
		boolean validaRG = RG.matches("[\\d\\W(.)]{1,}");
		if (validaRG == true) {
			this.RG = RG;
		}
		return validaRG;
	}

	public boolean setTipoEmail(String tipoEmail) {
		int tamanho, i;
		boolean ValidaEmail = false;
		tamanho = tipoEmail.length();
		for (i = 0; i < tamanho; i++) {
			if (tipoEmail.charAt(i) == '@') {
				ValidaEmail = true;
				this.tipoEmail = tipoEmail;
			}
		}
		return ValidaEmail;
	}

	public String getNome() {
		return this.nomeCompleto;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public String getSexo() {
		return this.sexo;
	}

	public String getProfissao() {
		return this.profissao;
	}

	public String getRG() {
		return this.RG;
	}

	public String getTipoEmail() {
		return this.tipoEmail;
	} // FIM M…TODOS JEAN

	// REGIS AMARAL
	public boolean validaAlfanumericos(String REF, int MAX) {
		boolean test = false;
		if (REF.length() <= MAX) {// maximo 50 caracteres
			// apenas alfanumericos
			boolean alfanumericos = REF
					.matches("[a-zA-Z0-9_ Á«·¡È‡¿…ÌÕÛ”˙⁄]{0,50}");
			if (alfanumericos == true) {
				test = true;
			}
		}
		return test;
	}

	public boolean setID(int ID) {
		boolean tID = false;
		return tID;
	}

	public boolean setInfoAdicionais(String InfoAdicionais, int QTD) {
		boolean tInfo = false;
		if (validaAlfanumericos(InfoAdicionais, QTD)) {
			this.InfoAdicionais = InfoAdicionais;
			tInfo = true;
		}
		return tInfo;
	}

	public boolean setReferencia(String Referencia, int QTD) {
		boolean tRef = false;
		if (validaAlfanumericos(Referencia, QTD)) {
			tRef = true;
			this.Referencia = Referencia;
		}
		return tRef;
	}

	public boolean setUF(String UF) {
		boolean test = false;
		if (UF.length() == 2) {// Apenas dois caracteres
			UF = UF.toUpperCase(); // aceito que usu·rio digite em minuscula
			boolean sigla = UF
					.matches("AC|AL|AP|AM|BA|CE|DF|ES|GO|MA|MT|MS|MG|PA|PB|PR|PE|PI|RJ|RN|RS|SC|SE|TO");
			if (sigla == true) {
				this.UF = UF;
				test = true;
			}
		}
		return test;
	}

	public void setData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public boolean setMontante(String MONT) {
		boolean tMont = false;
		int tam = MONT.length();

		if (MONT.compareTo("") == 0) {
			tMont = true;
		} else if (MONT.matches("[R][$] [0-9,.]{0,}")) {
			if (MONT.charAt(tam - 3) == ',') {
				if (tam <= 9) {
					tMont = true;
				} // R$ 999,99
				if (tam > 9 && tam <= 13 && MONT.charAt(tam - 7) == '.') {
					tMont = true;
				}// R$ 999.999,99
				if (tam > 13 && tam <= 17 && MONT.charAt(tam - 7) == '.'
						&& MONT.charAt(tam - 11) == '.') {
					tMont = true;
				}// R$ 999.999.999,99
			}
			if (tMont == true && MONT.compareTo("") != 0) {
				// converto e armazeno no formato float -> 1999.99
				MONT = MONT.replaceAll("[R$ .]{0,50}", "");
				MONT = MONT.replace(",", ".");
				this.Montante = Float.parseFloat(MONT);
			}
		}
		return tMont;
	}

	public String getMontante() {
		return NumberFormat.getCurrencyInstance().format(this.Montante);
	}

	public String getUF() {
		return this.UF;
	}

	public String getReferencia() {
		return this.Referencia;
	}

	public int getID() {
		return this.ID;
	}

	public String getDataCad() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	public String getInfoAdicionais() {
		return this.InfoAdicionais;
	}// FIM METODOS REGIS

	// ANDR…
	public boolean setComp(String comp) {
		boolean alfanumerico = comp.matches("[a-zA-Z0-9 ]{0,20}");
		if (alfanumerico) {
			this.comp = comp;
			return true;

		}
		return false;
	}

	// set do bairro.
	public boolean setBairro(String bairro) {

		boolean alfanumerico = bairro.matches("[a-zA-Z0-9 ]{0,50}");
		if (alfanumerico == true) {
			this.bairro = bairro;
			return true;
		}
		return false;
	}

	// set do cpf.
	public boolean setCpf(String cpf) {

		String cpftemp = formataRemocaoCaracteresEspeciais(cpf);

		int dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9, dig10, dig11, dv1, dv2, qDig;

		if ((cpftemp.length() == 0) || (cpftemp.length() < 11)
				|| (cpftemp.length() > 11)) {

			return false;
		}

		qDig = cpftemp.length(); // Quantidade total de caracteres

		// Gravar posiÁ„o dos caracteres
		try {
			dig1 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 11)));
			dig2 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 10)));
			dig3 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 9)));
			dig4 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 8)));
			dig5 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 7)));
			dig6 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 6)));
			dig7 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 5)));
			dig8 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 4)));
			dig9 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 3)));
			dig10 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 2)));
			dig11 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 1)));
		} catch (NumberFormatException e) {
			return false;
		}

		// C·lculo para o primeiro dÌgito validador
		dv1 = dig1 + (dig2 * 2) + (dig3 * 3) + (dig4 * 4) + (dig5 * 5)
				+ (dig6 * 6) + (dig7 * 7) + (dig8 * 8) + (dig9 * 9);
		dv1 = dv1 % 11;

		if (dv1 == 10) {

			dv1 = 0; // Se o resto for igual a 10, dv1 igual a zero
		}

		// C·lculo para o segundo dÌgito validador
		dv2 = dig2 + (dig3 * 2) + (dig4 * 3) + (dig5 * 4) + (dig6 * 5)
				+ (dig7 * 6) + (dig8 * 7) + (dig9 * 8) + (dv1 * 9);
		dv2 = dv2 % 11;

		if (dv2 == 10) {

			dv2 = 0; // Se o resto for igual a 10, dv2 igual a zero
		}

		// ValidaÁ„o dos dÌgitos validadores, apÛs o c·lculo realizado
		if (dig10 == dv1 && dig11 == dv2) {

			this.cpf = cpf;
			return true;

		} else {
			return false;
		}
	}

	private static String formataRemocaoCaracteresEspeciais(String valor) {

		if (valor.indexOf(",") != -1 || valor.indexOf(".") != -1
				|| valor.indexOf("-") != -1 || valor.indexOf("/") != -1) {

			StringBuffer valorAux = new StringBuffer();
			for (int i = 0; i < valor.length(); i++)
				if ((valor.charAt(i) != ',') && (valor.charAt(i) != '.')
						&& (valor.charAt(i) != '-') && (valor.charAt(i) != '/'))
					valorAux.append(valor.charAt(i));

			valor = valorAux.toString();
		}
		return valor;
	}

	public String getComp() {
		return this.comp;
	}

	public String getBairro() {
		return this.bairro;
	}

	public String getCpf() {
		return this.cpf;
	}// FIM METODOS ANDR…

}
