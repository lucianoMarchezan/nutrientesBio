package com.nutrientesbio.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Luciano on 04/09/2016.
 */
public class CriaBanco extends SQLiteOpenHelper {
    public static final String NOME_BANCO = "banco.db";
    public static final String TABELA = "nutriente";
    public static final String ID = "_id";
    public static final String NOME = "nome";
    public static final String DESCRICAO = "descricao";
    public static final int VERSAO = 1;

    public CriaBanco(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS " + TABELA + "("
                + ID + " integer primary key autoincrement,"
                + NOME + " text,"
                + DESCRICAO + " text"
                + ")";
        db.execSQL(sql);

        Cursor c = db.rawQuery("SELECT * FROM nutriente", null);
// <editor-fold defaultstate="collapsed" desc="Insert BD">
        if (c != null) {
            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 1 + ","
                    + "'Acesulfame de potássio',"
                    + "'Adoçante artificial composto por um sal orgânico, também conhecido como acesulfame-k, porque k é o símbolo químico do potássio.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 2 + ","
                    + "'Ácido ascórbico',"
                    + "'Uma das formas da vitamina C.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 3 + ","
                    + "'Acesulfame-K',"
                    + "'Ver acesulfame de potássio.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 4 + ","
                    + "'Ácido fólico',"
                    + "'É uma vitamina do complexo B, pode ser conhecido como folato. É importante na formação de novas células no organismo." +
                    " A necessidade da ingestão de ácido fólico aumenta durante a gestação, pois neste período ocorre a multiplicação de novas células." +
                    " Os sintomas da sua deficiência no organismo são: anemia do tipo célula grande ou macrocítica, língua vermelha e lisa, confusão mental, fraqueza, " +
                    "irritabilidade, dor de cabeça. Sua ingestão em demasia pode ocultar os sintomas da deficiência da vitamina B12. " +
                    "É encontrado em grãos enriquecidos, folhas verdes, leguminosas, sementes, fígado. O ácido fólico pode ser facilmente destruído pelo calor. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 5 + ","
                    + "'Ácido pantotênico',"
                    + "'É uma vitamina do complexo B. É envolvido na síntese de lipídios, neurotransmissores, hormônios esteroides e hemoglobina. " +
                    "Os sintomas de sua deficiência são: vômito, náusea, cólicas estomacais, insônia, depressão, irritabilidade, inquietação, apatia, hipoglicemia, " +
                    "aumento de sensibilidade à insulina. Este nutriente é facilmente destruído pelos processos de congelamento, enlatamento e refinamento. " +
                    " É encontrado em carnes de aves, bovina, fígado, rins, nos cogumelos, no tomate, no abacate, brócolis e cereais integrais.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 6 + ","
                    + "'Açúcares',"
                    + "'São todos os monossacarídeos e dissacarídeos presentes em um alimento que são digeridos, absorvidos e metabolizados pelo ser humano. " +
                    "Não se incluem os polióis.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 7 + ","
                    + "'Açúcar de confeiteiro',"
                    + "'Sacarose em pó, muito fino, 99,9% pura.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 8 + ","
                    + "'Açúcar granulado',"
                    + "'Sacarose cristalina, 99,9% pura.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 9 + ","
                    + "'Adoçantes artificiais',"
                    + "'É um substituto do açúcar, não é nutritivo, sendo que não fornece quantidade significativa de energia.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 10 + ","
                    + "'Açúcar invertido',"
                    + "'Mistura de glicose e frutose formada por hidrólise da sacarose em um processo químico, " +
                    "é mais doce que a sacarose. Este açúcar é usado como aditivo para conservar alimentos frescos.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 11 + ","
                    + "'Açúcar marrom',"
                    + "'Cristais de açúcar branco refinado misturado com melaço, contém de 91% a 96% de sacarose pura.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 12 + ","
                    + "'Aditivos',"
                    + "'Substâncias não normalmente consumidas como alimentos, mas adicionadas a eles intencionalmente.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 13 + ","
                    + "'Adoçantes artificiais',"
                    + "'Substitutos de açúcar que fornecem quantidade de energia insignificante ou nula.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 14 + ","
                    + "'Alimentos para fins especiais',"
                    + "'São os alimentos processados especialmente para satisfazer necessidades particulares de alimentação determinadas por condições físicas ou" +
                    " fisiológicas particulares e ou transtornos do metabolismo e que se apresentem como tais. " +
                    "Incluí-se os alimentos destinados aos lactentes e crianças de primeira infância. " +
                    "A composição desses alimentos deverá ser essencialmente diferente da composição dos alimentos convencionais de natureza similar, caso existam.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 15 + ","
                    + "'Amido',"
                    + "'É um polissacarídeo vegetal composto de glicose. É a forma como as células das plantas armazenam a glicose. " +
                    "É encontrado nos grãos de trigo e arroz, nas raízes e tubérculos como batata e mandioca, e nas leguminosas, como ervilhas e feijões.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 16 + ","
                    + "'Aminoácidos',"
                    + "'São unidades moleculares que se unem por ligaçõees peptídicas e formam as proteínas.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 17 + ","
                    + "'Antioxidante',"
                    + "'são aditivos alimentares, conservantes que atrasam ou impedem o ranço de gorduras nos alimentos e outros danos causados nas comidas pelo oxigênio.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 18 + ","
                    + "'Biotina',"
                    + "'Vitamina do complexo B. Participa da síntese de gordura, metabolismo de aminoácidos e síntese de glicogênio. Sua deficiência pode causar depressão, " +
                    "   letargia, alucinações, sensação de dormência, formigamento nos braços e pernas, erupção escamosa ao redor dos olhos, nariz e boca, perda de cabelo." +
                    " É encontrada em alimentos como carnes, peixe, gema de ovo, soja, cereais integrais.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 19 + ","
                    + "'Cafeína',"
                    + "'Estimulante natural encontrado em muitos alimentos e bebidas comuns, incluindo café, chás e chocolate; pode melhorar a resistência estimulando a " +
                    "liberação de ácidos graxos." +
                    " Doses elevadas podem causar dor de cabeça, taquicardia e tremores.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 20 + ","
                    + "'Cálcio',"
                    + "'É o mineral mais abundante no corpo.  Proporciona força e rigidez aos ossos em formação (processo de mineralização), participa nas contrações musculares," +
                    " na coagulação sanguínea, na secreção de hormônios, na transmissão de impulsos nervosos, influencia na pressão arterial e nas defesas imunológicas. " +
                    "O cálcio presente no sangue é regulado pela vitamina D e pelos hormônios calcitonina e paratormônio. Com a ingestão equilibrada de alimentos ricos em cálcio," +
                    " o sangue consegue manter níveis adequados deste mineral, o que leva os ossos a acumularem cálcio e a permanecerem fortes e densos. Se a dieta alimentar for pobre" +
                    " neste mineral, os níveis de cálcio no sangue permanecem normais porque os ossos vão liberar cálcio para o sangue. E consequentemente os ossos ficaram fracos" +
                    " podendo resultar em osteoporose.     Sua deficiência pode causar perda óssea em adultos e um crescimento retardado em crianças.  " +
                    "O cálcio pode ser encontrado em alimentos como leite e seus derivados, sardinhas, ostras, agrião, brócolis, couve, mostarda, beterraba. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 21 + ","
                    + "'Carboidratos',"
                    + "'Também chamados de hidratos de carbono ou glicídios: são todos os mono, di e polissacarídeos, incluídos os polióis presentes no alimento, que são digeridos, " +
                    "absorvidos e metabolizados pelo ser humano. São os componentes dos alimentos cuja principal função é fornecer a energia para as células do corpo, " +
                    "principalmente do cérebro. São encontrados em maior quantidade em massas, arroz, açúcar, mel, pães, farinhas, " +
                    "tubérculos (como batata, mandioca e inhame) e doces em geral.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 22 + ","
                    + "'Carragena',"
                    + "'É adicionada ao alimento como estabilizante.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 23 + ","
                    + "'Cereal integral',"
                    + "'Grão produzido na sua integridade, não refinado.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 24 + ","
                    + "'Cerveja',"
                    + "'Bebida alcóolica produzida pela fermentação do malte e lúpulo.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 25 + ","
                    + "'Ciclamato de sódio',"
                    + "'É um edulcorante artificial. É um ácido orgânico que possui poder adoçante trinta vezes maior que a sacarose. É solúvel em água." +
                    " É usado na indústria alimentícia, tem alta durabilidade. " +
                    "No Brasil o ciclamato é utilizado em associação com a sacarina, sendo que seu uso isolado como aditivo de alimentos não é recomendado. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 26 + ","
                    + "'Cobre',"
                    + "'É um micromineral que auxilia na formação da hemoglobina. Sua deficiência pode causar anemia e deformação óssea. " +
                    "O excesso deste mineral causa dano hepático. " +
                    "É encontrado nas leguminosas, frutos do mar, nozes, cereais integrais e sementes. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 27 + ","
                    + "'Conservantes',"
                    + "'Agentes antimicrobianos, antioxidantes e outros aditivos alimentares que retardam a deterioração ou mantém a qualidade desejável.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 28 + ","
                    + "'Consumidores',"
                    + "'São pessoas físicas que compram ou recebem alimentos com o objetivo de satisfazer suas necessidades alimentares e nutricionais.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 29 + ","
                    + "'Conteúdo Líquido',"
                    + "'Indica a quantidade total de produto contido na embalagem. O valor deve ser expresso em unidade de massa (quilo) ou volume (litro).'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 30 + ","
                    + "'Corantes artificiais',"
                    + "'Corantes certificados adicionados aos alimentos para melhorar a aparência.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 31 + ","
                    + "'Diet',"
                    + "'São os alimentos especialmente formulados para grupos da população que apresentam condições fisiológicas específicas. " +
                    "Como, por exemplo, geléia para dietas com restrição de açúcar. São feitas modificações no conteúdo de nutrientes, adequando-os a dietas de indivíduos que " +
                    "pertençam a esses grupos da população." +
                    " Apresentam na sua composição quantidades insignificantes ou são totalmente isentos de algum nutriente.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 32 + ","
                    + "'Emulsificante',"
                    + "'Substância com porções solúveis em água e solúveis em gordura que promove a mistura de óleos e gorduras em solução aquosa. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 33 + ","
                    + "'Enzimas',"
                    + "'São proteínas especiais, também chamadas de biocatalisadoras. Possuem a função de acelerar as reaçoes químicas essenciais para os seres vivos, " +
                    "tanto vegetais quanto animais.'"
                    + ")";
            db.execSQL(sql);


            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 34 + ","
                    + "'Estévia',"
                    + "'Arbusto cujas folhas são usadas para fabricar um tipo de adoçante, não apresenta calorias.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 35 + ","
                    + "'Ferro',"
                    + "'É um micromineral essencial para muitas atividades celulares. O ferro é usado na produção de aminoácidos, colágeno, hormônios e neurotransmissores." +
                    " Há proteínas especiais que auxiliam o corpo a absorver o ferro dos alimentos, como a ferritina. Ter deficiência de ferro não significa ter anemia ferropriva. " +
                    "A deficiência de ferro se refere a diminuição dos estoques deste mineral no organismo sem relação com a presença de anemia. A anemia ferropriva é uma grave " +
                    "diminuição no estoque de ferro que resulta em uma concentração baixa de hemoglobina, os glóbulos vermelhos são pálidos e pequenos. A anemia causa fadiga, " +
                    "fraqueza, dores de cabeça, imunidade comprometida, palidez, incapacidade de controlar a temperatura corporal. Sua ingestão em demasia pode causar perturbações" +
                    " gastrointestinais, fadiga, dor nas articulações, pigmentação na pele, dano nos órgãos. É encontrado na carne bovina, aves e peixes, ovos, " +
                    "leguminosas e frutas secas. A vitamina C, o ácido cítrico, o ácido láctico e açúcares presentes no vinho são fatores que auxiliam na absorção do ferro no organismo.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 36 + ","
                    + "'Fibra Alimentar',"
                    + "'Composto vegetal formado por moléculas como a celulose, não podem ser digeridas pelo ser humano. " +
                    "Está presente em diversos tipos de alimentos de origem vegetal, como frutas,hortaliças, feijões e alimentos integrais. A ingestão de " +
                    "fibras auxilia no funcionamento do intestino. Procure consumir alimentos com alto %VD de fibras alimentares.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 37 + ","
                    + "'Flúor',"
                    + "'É um micromineralque deixa os ossos e dentes mais fortes e resistentes, auxilia na resistência dos dentes a cárie.Sua deficiência no " +
                    "organismo deixa os dentes suscetíveis a carie dentaria. Assim como uma elevação na quantidade de flúor pode prejudicar os dentes causando " +
                    "a fluorose (corrosão e descoloração dentária). O flúor pode ser encontrado em chás, frutos do mar e na água potável fluoretada. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 38 + ","
                    + "'Fósforo',"
                    + "'É o segundo mineral mais abundante no corpo, é encontrado combinado com o cálcio nos ossos e dentes. Este mineral auxilia no metabolismo " +
                    "energético, muitas enzimas e vitaminas do Complexo B se tornam ativas quando um grupo de fosfato é incorporado. Atua na mineralização dos ossos " +
                    "e dentes, é componente das células. Alguns sintomas da sua deficiência no organismo são fraqueza e dores nos ossos. Sua ingestão em demasia " +
                    "pode causar calcificação dos tecidos não esqueléticos, e prejudicar o funcionamento dos rins. Pode ser encontrado em alimentos como peixe, " +
                    "carne, ovos e leite.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 39 + ","
                    + "'Gelatina',"
                    + "'Forma solúvel de colágeno de proteína usada para espessar alimentos; as vezes, falsamente promovidas como capaz de aumentar o vigor.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 40 + ","
                    + "'Geleia real',"
                    + "'Substância produzida pelas abelhas operárias que alimenta a rainha; falsamente promovida por aumentar a força.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 41 + ","
                    + "'Glutamato monossódico',"
                    + "'Sal de sódio do aminoácido ácido glutâmico comumente usado com realçador de sabor.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 42 + ","
                    + "'Gorduras monoinsaturadas',"
                    + "'São os triglicerídeos que contém ácidos graxos com uma dupla ligação cis, expressos como ácidos graxos livres.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 43 + ","
                    + "'Gorduras poliinsaturadas',"
                    + "'São os triglicerídeos que contém ácidos graxos com duplas ligações cis-cis separadas por grupo metileno, expressos como ácidos graxos livres.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 44 + ","
                    + "'Gorduras Saturadas',"
                    + "'Tipo de gordura presente em alimentos de origem animal. São exemplos: carnes, toucinho, pele de frango, queijos, leite integral, manteiga, " +
                    "requeijão, iogurte. O consumo desse tipo de gordura deve ser moderado porque, quando consumido em grandes quantidades, pode aumentar o risco " +
                    "de desenvolvimento de doenças do coração. Alto %VD significa que o alimento apresenta grande quantidade de gordura saturada em relação à " +
                    "necessidade diária de uma dieta de 2000 Kcal.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 45 + ","
                    + "'Gorduras trans',"
                    + "'São os triglicerídeos que contém ácidos graxos insaturados com uma ou mais dupla ligaçãotrans, expressos como ácidos graxos livres.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 46 + ","
                    + "'Gorduras ou lipídeos',"
                    + "'São substâncias de origem vegetal ou animal, insolúveis em água, formadas detriglicerídeos e pequenas quantidades de não glicerídeos, " +
                    "principalmente fosfolipídeos.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 47 + ","
                    + "'Gorduras poliinsaturadas',"
                    + "'São os triglicerídeos que contém ácidos graxos com duplas ligações cis-cis separadas por grupo metileno, expressos como ácidos graxos livres.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 48 + ","
                    + "'Gorduras Totais',"
                    + "'As gorduras são as principais fontes de energia do corpo e ajudam na absorção das vitaminas A, D, E e K. As gorduras totais referem-se à soma" +
                    " de todos os tipos de gorduras encontradas em um alimento, tanto de origem animal quanto de origem vegetal.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 49 + ","
                    + "'Iodo',"
                    + "'É um micromineral,faz parte de dois hormônios da tireoide queajudam a regular o crescimento, o desenvolvimento e a taxa metabólica. " +
                    "A deficiência de iodo pode levar ao bócio simples (um aumento da glândula da tireoide), a um retardo mental e físico. " +
                    "Os níveis elevados de iodo podem causar problemas no funcionamento da tireoide, TSH elevado, bócio. " +
                    "Este mineral pode ser encontrado no sal iodado, nos frutos do mar, plantas cultivadas em solo rico em iodo e em animais alimentados " +
                    "com estas plantas. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 50 + ","
                    + "'Lactose',"
                    + "'É um nutriente que pertence a clase dos carboidratos. É o açúcar do leite. É um dissacarídeo, ou seja, cada uma das suas moléculas é formada por uma unidade" +
                    "de glicose e outra de galactose unidas.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 51 + ","
                    + "'Lecitina de soja',"
                    + "'É usada na indústria alimentícia como emulsificante, na combinação de ingredientes hidrossolúveis e lipossolúveis, que normalmente não se" +
                    " misturam, como água e óleo.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 52 + ","
                    + "'Light',"
                    + "'São aqueles que apresentam a quantidade de algum nutriente ou valor energético reduzido quando comparado a um alimento convencional. " +
                    "São definidos os teores de cada nutriente e ou valor energético para que o alimento seja considerado light. " +
                    "Por exemplo, iogurte com redução de 30% de gordura é considerado light.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 53 + ","
                    + "'Lote',"
                    + "'É um número que faz parte do controle naprodução. Caso haja algum problema, oproduto pode ser recolhido ou analisadopelo lote ao qual pertence. " +
                    "Informação Nutricional Obrigatória.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 54 + ","
                    + "'Magnésio',"
                    + "'Auxilia na mineralização dos ossos, nas contrações musculares, na transmissão de impulsos nervosos, na manutenção dos dentes e funcionamento" +
                    " do sistema imunológico. Sua deficiência também pode causar problemas como fraqueza, convulsões, alucinações, dificuldades para engolir, " +
                    "problemas de crescimento nas crianças. São fontes de magnésio alimentos como nozes, cereais integrais, vegetais folhosos verdes, cacau.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 55 + ","
                    + "'Manganês',"
                    + "'É um micromineral, sua ingestão em excesso pode causar distúrbios no sistema nervoso. Pode ser encontrado nos cereais integrais, nas nozes, " +
                    "hortaliças folhosas e nas nozes.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 56 + ","
                    + "'Minerais principais',"
                    + "'Nutrientes minerais essenciais encontrados no corpo humano em quantidades superiores a 5 g, são chamados de macrominerais. " +
                    "São assim chamados porque estão presentes e são necessários em maiores quantidades no organismo. São elementos que mantém sua identidade química," +
                    " podem se ligar a outras substâncias e interagir com outros minerais, limitando, dessa maneira, sua absorção. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 57 + ","
                    + "'Microminerais',"
                    + "'Ocorrem em menos quantidade no corpo do que os macrominerais.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 58 + ","
                    + "'Niacina',"
                    + "'É uma vitamina do complexo B, participa do metabolismo da glicose, gordura e álcool. Sua deficiência causa o pelagra, " +
                    "doença com os seguintes sintomas: diarreia, dermatite e demência. Sua abundância no organismo pode causar danos ao fígado, " +
                    "tolerância a glicose. Pode ser encontrada em leite, ovos, carnes, aves, peixes, pães, cereais integrais, oleaginosas e todos os " +
                    "alimentos que contém proteínas. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 59 + ","
                    + "'Poliois',"
                    + "'São edulcorantes obtidos pela hidrogenação de açúcares como sacarose, glicose e frutose.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 60 + ","
                    + "'Porção',"
                    + "'É a quantidade média do alimento que deveria ser consumida por pessoas sadias, maiores de 36 meses, em cada ocasião de consumo," +
                    " com a finalidade de promover uma alimentação saudável.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 61 + ","
                    + "'Potássio',"
                    + "'É um mineral que participa da manutenção do equilíbrio hídrico, transmissões de impulsos nervosos e contrações musculares. " +
                    "Os sintomas da deficiência de potássio no corpo humano: fraqueza muscular e paralisia, " +
                    "podendo haver elevação da pressão arterial. São fontes deste nutriente: carnes, leite, frutas, hortaliças, grãos e leguminosas.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 62 + ","
                    + "'Proteínas',"
                    + "'São componentes dos alimentos necessários para construção e manutenção dos nossos órgãos, tecidos e células. " +
                    "Encontramos nas carnes, ovos, leites e derivados, e nas leguminosas (feijões, soja e ervilha).'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 63 + ","
                    + "'Sódio',"
                    + "'Este mineral auxilia a transmissão de impulsos nervosos e nas contrações musculares, a deficiência deste mineral no organismo " +
                    "pode causar cãibras e perda de apetite.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 64 + ","
                    + "'Sorbitol',"
                    + "'É um edulcorante natural sintetizado a partir da glicose. É encontrado naturalmente em frutas e verduras. Pode provocar flatulências e " +
                    "diarreias quando consumido em altas concentrações. É utilizado na indústria de alimentos como umectantes, " +
                    "estabilizantes e edulcorantes em alimentos e bebidas.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 65 + ","
                    + "'Valor Energético',"
                    + "'É a energia produzida pelo nosso corpo proveniente dos carboidratos, proteínas e gorduras totais. Na rotulagem nutricional o " +
                    "valor energético é expresso em forma de quilocalorias (kcal) e quilojoules (kJ). Obs: Quilojoules (kJ) é outra forma de medir o valor" +
                    " energético dos alimentos, sendo que 1 kcal equivale a 4,2 kJ.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 66 + ","
                    + "'Vitamina A',"
                    + "'É uma vitamina lipossolúvel, estas vitaminas precisam da bile para serem dissolvidas.Principais funções desta vitamina: ajuda a " +
                    "manter a visão, na reprodução e no crescimento,na manutenção da saúde da pele e dos tecidos. Sua deficiência pode causar a cegueira noturna " +
                    "(falta de vitamina A na parte posterior dos olhos, a retina), a cegueira total (falta de vitamina A na parte frontal do olho, na córnea) e a" +
                    " queratinização (as células da pele começam a produzir queratina, havendo um acúmulo desta proteína o que deixa a peleseca e  escamosa devido" +
                    " a produção descontrolada de queratina). Sua ingestão em excesso pode causar anormalidades do fígado e redução da densidade óssea. Esta vitamina" +
                    " pode ser encontrada em alimentos de origem animal (fígado, óleo de fígado de peixe, leite, manteiga e ovos). Hortaliças de cores escuras " +
                    "(espinafre) e vegetais e frutas de cores alaranjadas (abóbora e melão) são fontes desta vitamina.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 67 + ","
                    + "'Vitamina B1',"
                    + "'Também chamada de tiamina. É essencial no metabolismo das células, Sua deficiência pode causar danos ao sistema nervoso, ao coração e " +
                    "aos músculos. A deficiência prolongada desta vitamina pode causar a doença chamada de beribéri, é encontrada em alimentos como: cereais " +
                    "integrais, carne de porco, alimentos enriquecidos. Os alimentos ao serem fervidos perdem quantidade desta vitamina. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 68 + ","
                    + "'Vitamina B2',"
                    + "'Também denominada de riboflavina, atua em reações como na liberação de energia de nutrientes em todas as células do corpo. " +
                    "Sua deficiência causa inflamação das membranas da boca, pele, olhos e trato gastrointestinal. É encontrada no leite e seus derivados, " +
                    "cereais integrais, fígado, brócolis, aspargos e espinafre. A riboflavina é estável ao calor, o cozimento não a destrói. A luz ultravioleta e a" +
                    " irradiação destroem a riboflavina, por esta razão o leite é vendido em recipientes plásticos opacos ou em recipientes de papelão. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 69 + ","
                    + "'Vitamina B6',"
                    + "'É usada no metabolismo dos ácidos graxos e dos aminoácidos, auxilia na conversão do triptofano em niacina e serotonina, contribui " +
                    "para a produção dos glóbulos vermelhos. Sua deficiência pode causar: dermatite escamosa, anemia, depressão, confusão, convulsões. " +
                    "Sua ingestão em excesso pode causar irritabilidade, fadiga, dores de cabeça, danos nos nervos, causando dormência e fraqueza muscular, " +
                    "levando a incapacidade de se locomover, leões na pele. As carnes, peixes, aves, batatas, leguminosas, frutas não cítricas, cereais" +
                    " fortificados, fígados, derivados de soja são fontes de vitamina B6.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 70 + ","
                    + "'Vitamina B12',"
                    + "'É uma vitamina caracterizada pela presença de cobalto, ajuda a manter as células nervosas, contribui para a quebra de alguns ácidos" +
                    " graxos e aminoácidos. A sua deficiência pode causar anemia perniciosa, fadiga, degeneração dos nervos periféricos que progridem para a " +
                    "paralisia.Fontes ricas nesta vitamina: carne, peixe, aves, moluscos, leite, queijo, ovos, cereais enriquecidos. Esta vitamina é facilmente" +
                    " destruída pelo cozimento no microondas. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 71 + ","
                    + "'Vitamina C',"
                    + "'É uma vitamina com propriedade antioxidante, protegendo os tecidos contra o estresse oxidativo, melhora a absorção de ferro no intestino." +
                    " A carência desta vitamina pode causar o escorbuto, sangramento na gengiva, pele áspera, os músculos se degeneram. O consumo em excesso " +
                    "pode causar problemas como diarreia, cólicas abdominais, náusea, dor de cabeça, problemas no trato urinário.  A vitamina C é encontrada em " +
                    "frutas cítricas, hortaliças como repolho, e em hortaliças de cor verde escura como brócolis e couve. Morango, melão, tomate, manga e mamão " +
                    "são outros alimentos que possuem esta vitamina. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 72 + ","
                    + "'Vitamina D',"
                    + "'O corpo pode sintetizar esta vitamina com o auxilio da luz solar. Os raios solares atingem o precursor na pele e o convertem " +
                    "em pré-vitamina D. Esta vitamina tem uma proteína ligadora que a carrega para órgãos alvo, como intestinos, rins e os ossos. " +
                    "Mantém a concentração de cálcio e fósforo no sangue, os ossos precisam absorver e depositar estes minerais para crescerem mais fortes." +
                    " A deficiência desta vitamina gera uma deficiência de cálcio, o que pode causar problemas nos ossos. O raquitismo é uma doença causada " +
                    "pela carência da vitamina D. Os ossos não calcificam normalmente, causando um retardo do crescimento, deformação das costelas, retardamento" +
                    " do fechamento da moleira em crianças, ossos moles. O excesso desta vitamina eleva a concentração de cálcio no sangue, causando pedras nos rins. " +
                    "Esta vitamina pode ser encontrada em leites fortificados. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 73 + ","
                    + "'Vitamina E',"
                    + "'É uma vitamina lipossolúvel, atua como um antioxidante, defensor contra a reação adversa dos radicais livres, " +
                    "evita a oxidação dos ácidos graxos, poliinsaturados. Sua deficiência pode causar um rompimento dos glóbulos vermelhos." +
                    " É encontrada em óleos vegetais como margarinas, molho para saladas, vegetais de folhas verdes, gérmen de trigo, fígado, gema de ovo, " +
                    "sementes e oleaginosas. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 74 + ","
                    + "'Vitamina K',"
                    + "'É uma vitamina lipossolúvel, atua na coagulação sanguínea. Sua deficiência causa doenças hemorrágicas (sangramento descontrolado). " +
                    "Fontes significativas desta vitamina: fígado, hortaliças de folhas verdes, hortaliças da família do repolho, leite, é produzido no trato" +
                    " gastrointestinal por bactérias que residem neste órgão. '"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 75 + ","
                    + "'Tiamina',"
                    + "'Ver vitamina B1.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 76 + ","
                    + "'Riboflavina',"
                    + "'Ver vitamina B2.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 77 + ","
                    + "'Sacarina',"
                    + "'É um adoçante artificial. Presente em adoçantes de mesa, alimentos, bebidas, cosméticos e produtos farmacêuticos.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 78 + ","
                    + "'Sucralose',"
                    + "'É um edulcorante artificial, adoçante derivado da sacarose. É usado como substituto do açúcar em preparações, não possui calorias." +
                    " A molécula de sucralose não é metabolizada após seu consumo. É um adoçante artificial feito a partir do açúcar.'"
                    + ")";
            db.execSQL(sql);

            sql = "INSERT INTO " + TABELA + " VALUES ("
                    + 79 + ","
                    + "'Zinco',"
                    + "'É um micromineral que participa do trabalho de várias proteínas do organismo. Está presente na síntese, no armazenamento e na liberação do " +
                    "hormônio insulina no pâncreas. Interage com as plaquetas na coagulação sanguínea, está envolvido na cicatrização da pele, no transporte da vitamina A  " +
                    "e na produção de espermatozoides. Alguns sintomas do excesso de zinco na alimentação: perda de apetite, imunidade comprometida, deficiência de " +
                    "cobre e de ferro. Alimentos que são fontes de zinco: carnes vermelhas, mariscos e grãos integrais.'"
                    + ")";
            db.execSQL(sql);


        }


        // </editor-fold>
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(db);
    }
}
