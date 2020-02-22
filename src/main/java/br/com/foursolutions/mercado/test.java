package br.com.foursolutions.mercado;

public class test {


    public static void main(String[] args) {
        StringBuilder query = new StringBuilder();
        query.append("SELECT \"CrmGrp_crm\", \"CrmGrp_grupoDado\", \"CrmGrp_afinidade\", \"CrmGrp_nome\", \"CrmGrpDiversos_statusMed\", ");
        query.append(" \"CrmGrp_logradouro\", \"CrmGrp_numeroLogradouro\", \"CrmGrp_complemento\", \"CrmGrp_bairro\", \"CrmGrp_cep\", ");
        query.append(" \"CrmGrp_municipio\", \"CrmGrp_estado\", \"CrmGrp_pais\", \"CrmGrp_ddd\", \"CrmGrp_telefone\", \"CrmGrp_fax\", \"CrmGrp_internet\", ");
        query.append(" \"CrmGrpDiversos_sexo\", \"CrmGrpDiversos_especialidade\", \"CrmGrpDiversos_cnpjClinica\", \"CrmGrpDiversos_cpfMed\" ");
        query.append(" \"CrmGrpDiversos_clientePref\", \"CrmGrpDiversos_situacaoCad\", \"CrmGrpDiversos_vip\", \"CrmGrp_celular\" ");
        query.append(" FROM \"CrmGrp\" LEFT OUTER JOIN \"CrmGrpDiversos\" ON ");
        query.append(" \"CrmGrp_crm\" = \"CrmGrpDiversos_crm\" AND \"CrmGrpDiversos_afinidade\" = ");
        query.append("'4' WHERE \"CrmGrp_crm\" = :crm ");

        System.out.println(query.toString());
    }
}
