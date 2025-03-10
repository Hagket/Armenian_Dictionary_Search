import stdlib.StdIn;
import java.util.ArrayList;
import java.util.*;

public class ArmenianDictionary {
    private int wordsFound;
    private final ArrayList<String> words;
    private final String[] armenianWords;

    public ArmenianDictionary() {
        wordsFound = 0;
        words = new ArrayList<>();
        armenianWords = new String[]{
                "ես",
                "դու",
                "նա",
                "մենք",
                "դուք",
                "նրանք",
                "այստեղ",
                "ով",
                "ինչ",
                "որտեղ",
                "ուր",
                "երբ",
                "ինչպես",
                "ոչ",
                "բոլոր",
                "շատ",
                "որոշ",
                "քիչ",
                "այլ",
                "ուրիշ",
                "մեկ",
                "երկու",
                "երեք",
                "չորս",
                "հինգ",
                "մեծ",
                "երկար",
                "լայն",
                "հաստ",
                "ծանր",
                "փոքր",
                "կարճ",
                "նեղ",
                "բարակ",
                "կին",
                "տղամարդ",
                "մարդ",
                "երեխա",
                "ամուսին",
                "մայր",
                "հայր",
                "կենդանի",
                "ձուկ",
                "թռչուն",
                "ոջիլ",
                "օձ",
                "ճիճու",
                "փայտ",
                "պտուղ",
                "սերմ",
                "տերեւ",
                "կեղեւ",
                "ծաղիկ",
                "խոտ",
                "պարան",
                "մաշկ",
                "կաշի",
                "միս",
                "արյուն",
                "ոսկոր",
                "ճարպ",
                "ձու",
                "եղջյուր",
                "պոզ",
                "պոչ",
                "փետուր",
                "մազ",
                "գլուխ",
                "ականջ",
                "աչք",
                "քիթ",
                "բերան",
                "ատամ",
                "լեզու",
                "եղունգ",
                "ոտք",
                "ծունկ",
                "ձեռք",
                "թեւ",
                "փոր",
                "փորոտիք",
                "աղիք",
                "վիզ",
                "մեջք",
                "կուրծք",
                "սիրտ",
                "լյարդ",
                "խմել",
                "կծել",
                "ծծել",
                "թքել",
                "ործկալ",
                "փչել",
                "շնչել",
                "ծիծաղել",
                "տեսնել",
                "իմանալ",
                "գիտենալ",
                "մտածել",
                "վախենալ",
                "քնել",
                "ապրել",
                "սպանել",
                "կռվել",
                "որսալ",
                "խփել",
                "հարվածել",
                "կտրել",
                "բաժանել",
                "խոցել",
                "քերծել",
                "քորել",
                "փորել",
                "լողալ",
                "գալ",
                "պառկել",
                "նստել",
                "շրջվել",
                "ընկնել",
                "տալ",
                "սեղմել",
                "շփել",
                "լվալ",
                "սրբել",
                "ձգել",
                "քաշել",
                "հրել",
                "նետել",
                "կապել",
                "կարել",
                "ասել",
                "երգել",
                "խաղալ",
                "հոսել",
                "սառչել",
                "ուռել",
                "արեւ",
                "աստղ",
                "ջուր",
                "անձրեւ",
                "գետ",
                "լիճ",
                "ծով",
                "քար",
                "ավազ",
                "փոշի",
                "ամպ",
                "մառախուղ",
                "մշուշ",
                "երկինք",
                "ձյուն",
                "սառույց",
                "ծուխ",
                "հուր",
                "կրակ",
                "մոխիր",
                "վառվել",
                "այրվել",
                "ճամփա",
                "ճանապարհ",
                "սար",
                "դեղին",
                "սպիտակ",
                "սեւ",
                "օր",
                "տարի",
                "տաք",
                "լիքը",
                "նոր",
                "հին",
                "փտած",
                "կեղտոտ",
                "կլոր",
                "սուր",
                "բութ",
                "հարթ",
                "թաց",
                "չոր",
                "մոտ",
                "աջ",
                "բչողական",
                "վատորակ",
                "արտասովոր",
                "դիմաւորել",
                "փայտփորիկ",
                "ողջունագիր",
                "նրա",
                "որ",
                "էր",
                "ին",
                "են",
                "հետ",
                "լինել",
                "ունենալ",
                "այս",
                "ից",
                "բառ",
                "բայց",
                "այն",
                "կամ",
                "եւ",
                "մինչեւ",
                "իսկ",
                "կարող",
                "դուրս",
                "որը",
                "անել",
                "իրենց",
                "ժամանակ",
                "եթե",
                "կամք",
                "յուրաքանչյուր",
                "ուզում",
                "օդի",
                "լավ",
                "նույնպես",
                "վերջ",
                "տուն",
                "կարդալ",
                "նավահանգիստ",
                "ավելացնել",
                "նույնիսկ",
                "երկիր",
                "բարձր",
                "այդպիսի",
                "հետեւել",
                "ինչու",
                "խնդրել",
                "տղամարդիկ",
                "փոփոխություն",
                "գնաց",
                "լույս",
                "բարի",
                "անհրաժեշտ",
                "նկար",
                "փորձել",
                "մեզ",
                "կրկին",
                "կետ",
                "աշխարհ",
                "կառուցել",
                "ինքնուրույն",
                "ցանկացած",
                "մաս",
                "վերցնել",
                "տեղ",
                "վերադառնալ",
                "միայն",
                "եկել",
                "շոու",
                "ամեն",
                "ինձ",
                "մեր",
                "տակ",
                "անունը",
                "միջոցով",
                "պարզապես",
                "ձեւը",
                "նախադասություն",
                "օգնություն",
                "ցածր",
                "գիծ",
                "տարբերվել",
                "հերթը",
                "պատճառը",
                "նշանակում",
                "իրավունք",
                "տղա",
                "էլ",
                "նույն",
                "ամբողջ",
                "կան",
                "օգտագործումը",
                "ձեր",
                "ապա",
                "նրանց",
                "գրել",
                "նման",
                "այնքան",
                "այդ",
                "նրան",
                "դեռ",
                "բան",
                "ունի",
                "նայել",
                "գնալ",
                "արել",
                "թիվը",
                "հնչել",
                "իմ",
                "քան",
                "կոչ",
                "առաջին",
                "ներքեւ",
                "կողմը",
                "եղել",
                "այժմ",
                "գտնել",
                "ղեկավար",
                "կանգնել",
                "սեփական",
                "էջ",
                "պետք",
                "հայտնաբերել",
                "պատասխան",
                "դպրոց",
                "սովորել",
                "գործարան",
                "կազմ",
                "սնունդ",
                "միջեւ",
                "պետական",
                "աչքի",
                "երբեք",
                "անցյալ",
                "թող",
                "միտք",
                "քաղաք",
                "ծառ",
                "ֆերմա",
                "սկիզբ",
                "զորություն",
                "սղոց",
                "հեռու",
                "ձախ",
                "ուշ",
                "մամուլ",
                "մոտիկ",
                "գիշեր",
                "իրական",
                "կյանք",
                "հյուսիս",
                "հյուրատետր",
                "կրել",
                "գիտություն",
                "ուտել",
                "սենյակ",
                "ընկեր",
                "սկսվեց",
                "գաղափար",
                "լեռնային",
                "անգամ",
                "բազա",
                "ձի",
                "վստահ",
                "դիտել",
                "գույն",
                "դեմքը",
                "բաց",
                "կարծես",
                "միասին",
                "հաջորդ",
                "ճերմակ",
                "երեխաներ",
                "սկսել",
                "ստացել",
                "քայլել",
                "օրինակ",
                "թուղթ",
                "խումբ",
                "միշտ",
                "երաժշտություն",
                "երկուսն",
                "նշան",
                "հաճախ",
                "նամակ",
                "մղոն",
                "ավտոմեքենա",
                "ոտքերը",
                "խնամք",
                "երկրորդ",
                "բավական",
                "պարզ",
                "աղջիկ",
                "սովորական",
                "երիտասարդ",
                "պատրաստ",
                "վեր",
                "կարմիր",
                "ցուցակ",
                "սակայն",
                "զգալ",
                "շուտով",
                "մարմին",
                "շուն",
                "ընտանիք",
                "ուղղակի",
                "ստեղծում",
                "լքել",
                "երգ",
                "չափել",
                "դուռը",
                "թվական",
                "դաս",
                "քամի",
                "հարց",
                "պատահել",
                "ամբողջական",
                "նավ",
                "կես",
                "ժայռ",
                "կարգը",
                "հարավ",
                "խնդիր",
                "կտոր",
                "գիտեր",
                "հետո",
                "վերեւ",
                "ամբողջություն",
                "թագավորը",
                "փողոց",
                "դյույմ",
                "բազմապատկել",
                "ոչինչ",
                "դասընթաց",
                "մնալ",
                "անիվ",
                "լրիվ",
                "ուժ",
                "կապույտ",
                "օբյեկտ",
                "որոշել",
                "մակերեւույթ",
                "խոր",
                "լուսին",
                "կղզի",
                "ոտքով",
                "համակարգ",
                "զբաղված",
                "փորձարկում",
                "գրառումը",
                "նավակ",
                "ընդհանուր",
                "ոսկի",
                "հնարավոր",
                "ինքնաթիռ",
                "զարմանում",
                "հազար",
                "առաջ",
                "վազում",
                "ստուգում",
                "խաղ",
                "հավասարեցնել",
                "վրիպել",
                "բերեց",
                "շոգ",
                "անվադող",
                "բերել",
                "այո",
                "հեռավոր",
                "լրացնել",
                "արեւելք",
                "նկարել",
                "մեջ",
                "միավոր",
                "իշխանություն",
                "քաղաքի",
                "տուգանք",
                "որոշակի",
                "թռչել",
                "անկում",
                "հանգեցնել",
                "լաց",
                "մութ",
                "նշում",
                "սպասել",
                "պլան",
                "գործիչ",
                "տուփ",
                "դաշտ",
                "մնացածը",
                "ֆունտ",
                "կատարած",
                "գեղեցկություն",
                "տեղերի",
                "կանգնած",
                "պարունակել",
                "ճակատ",
                "սովորեցնել",
                "շաբաթ",
                "եզրափակիչ",
                "տվեց",
                "կանաչ",
                "ախ",
                "արագ",
                "զարգանալ",
                "օվկիանոս",
                "ջերմ",
                "ազատ",
                "րոպե",
                "ուժեղ",
                "հատուկ",
                "միտքը",
                "ետեւում",
                "արտադրել",
                "փաստ",
                "տարածք",
                "լավագույն",
                "ժամ",
                "ընթացքում",
                "հարյուր",
                "հիշում",
                "քայլ",
                "վաղ",
                "արեւմուտք",
                "հիմք",
                "հետաքրքրություն",
                "հասնել",
                "բայ",
                "երգեցողություն",
                "լսել",
                "վեց",
                "սեղան",
                "ճանապարհորդություն",
                "ավելի քիչ",
                "առավոտ",
                "տասը",
                "ձայնավոր",
                "դեպի",
                "պատերազմ",
                "դնել",
                "դեմ",
                "դանդաղ",
                "կենտրոն",
                "գումար",
                "ծառայել",
                "հայտնվել",
                "ճանապարհային",
                "քարտեզ",
                "կանոն",
                "կառավարել",
                "քաշեք",
                "ցուրտ",
                "ծանուցում",
                "ձայն",
                "էներգիա",
                "որս",
                "հավանական",
                "մահճակալ",
                "եղբայր",
                "զբոսանք",
                "բջջային",
                "հավատալ",
                "գուցե",
                "ընտրել",
                "հանկարծակի",
                "հաշվել",
                "հրապարակ",
                "պատճառ",
                "երկարություն",
                "ներկայացնել",
                "արվեստ",
                "ենթակա",
                "մարզ",
                "չափը",
                "լուծել",
                "խոսել",
                "քաշը",
                "շրջան",
                "զույգ",
                "ներառում",
                "վանկ",
                "զգացի",
                "գնդակ",
                "ալիք",
                "թողնել",
                "թեմա",
                "ներկա",
                "պարի",
                "շարժիչ",
                "դիրքորոշումը",
                "վարել",
                "նյութական",
                "կոտորակ",
                "անտառ",
                "մրցավազք",
                "պատուհան",
                "խանութ",
                "ամառ",
                "գնացք",
                "ապացուցել",
                "մենակ",
                "վարժություն",
                "պատ",
                "լեռ",
                "մաղթում",
                "խորհուրդ",
                "ուրախություն",
                "ձմեռ",
                "գրավոր",
                "վայրի",
                "գործիք",
                "ապակի",
                "Made",
                "By",
                "Hagop",
                "Ketchedjian",
                "կով",
                "աշխատանք",
                "եզրին",
                "նշանը",
                "մուտքը",
                "անցյալը",
                "փափուկ",
                "զվարճանք",
                "պայծառ",
                "գազ",
                "եղանակ",
                "ամիս",
                "միլիոն",
                "սալոնի",
                "հուսով",
                "հագցնել",
                "տարօրինակ",
                "գնացել",
                "առեւտրի",
                "մեղեդին",
                "ուղեւորություն",
                "գրասենյակ",
                "ստանալ",
                "կարգ",
                "խորհրդանիշ",
                "մեռնել",
                "նվազագույնը",
                "բղավել",
                "բացառությամբ",
                "տոնուս",
                "միանալ",
                "առաջարկում",
                "մաքուր",
                "կոտրել",
                "տիկին",
                "բակ",
                "բարձրացում",
                "վատ",
                "հարված",
                "ձեթ",
                "դիպչել",
                "աճել",
                "ցենտ",
                "խառնել",
                "թիմ",
                "մետաղալար",
                "ծախսերը",
                "կորցրել",
                "դարչնագույն",
                "հագնել",
                "այգի",
                "հավասար",
                "ուղարկել",
                "ընկել",
                "տեղավորել",
                "հոսքը",
                "արդար",
                "բանկ",
                "հավաքել",
                "պահել",
                "վերահսկիչ",
                "տասնորդական",
                "խախտել",
                "գործ",
                "միջին",
                "որդի",
                "պահ",
                "մասշտաբ",
                "բարձրաձայն",
                "գարուն",
                "պահպանել",
                "ուղիղ",
                "համահունչ",
                "ազգ",
                "բառարան",
                "կաթ",
                "արագություն",
                "մեթոդ",
                "վճարել",
                "դարաշրջան",
                "զգեստ",
                "զարմանք",
                "հանգիստ",
                "փոքրիկ",
                "բարձրանալ",
                "զով",
                "դիզայն",
                "աղքատ",
                "փորձ",
                "հատակ",
                "երկաթ",
                "միայնակ",
                "քարտ",
                "բնակարան",
                "քսան",
                "մաշկի",
                "ժպիտը",
                "ծալել",
                "փոս",
                "անցնել",
                "ութ",
                "գյուղ",
                "հանդիպում",
                "արմատ",
                "բարձրացնել",
                "մետաղ",
                "արդյոք",
                "հրում",
                "յոթ",
                "պարբերություն",
                "երրորդ",
                "հերոս",
                "մազերը",
                "նկարագրել",
                "խոհարար",
                "հարկ",
                "արդյունք",
                "այրել",
                "բլուր",
                "ապահով",
                "կատու",
                "դար",
                "համարում",
                "տիպ",
                "օրենք",
                "բիտ",
                "ափ",
                "արտահայտություն",
                "լռակյաց",
                "բարձրահասակ",
                "հող",
                "գլորում",
                "ջերմաստիճան",
                "մատ",
                "արդյունաբերություն",
                "արժեք",
                "կռիվ",
                "սուտ",
                "ծեծել",
                "հարուցել",
                "բնական",
                "իմաստ",
                "կապիտալ",
                "չի",
                "աթոռ",
                "վտանգ",
                "միրգ",
                "հարուստ",
                "զինվոր",
                "ընթացք",
                "գործել",
                "պրակտիկա",
                "առանձին",
                "դժվար",
                "բժիշկ",
                "խնդրում",
                "պաշտպանել",
                "կեսօր",
                "բուսաբուծություն",
                "ժամանակակից",
                "տարր",
                "ուսանող",
                "անկյուն",
                "կուսակցություն",
                "մատակարարում",
                "ում",
                "տեղադրել",
                "մատանի",
                "բնավորությունը",
                "միջատ",
                "բռնել",
                "ժամկետը",
                "ցույց տալ",
                "ռադիո",
                "խոսեց",
                "ատոմ",
                "մարդկային",
                "պատմություն",
                "ազդեցություն",
                "էլեկտրական",
                "ակնկալում",
                "ոսկրածուծի",
                "երկաթուղի",
                "պատկերացնել",
                "ապահովել",
                "համաձայն",
                "այսպիսով",
                "մեղմ",
                "կապիտան",
                "ենթադրություն",
                "թեւը",
                "ստեղծել",
                "հարեւանը",
                "լվանալը",
                "ամբոխ",
                "եգիպտացորեն",
                "համեմատել",
                "բանաստեղծություն",
                "լարային",
                "զանգ",
                "կախված",
                "շփում",
                "խողովակ",
                "հայտնի",
                "դոլար",
                "հոսք",
                "վախ",
                "տեսարան",
                "եռանկյունի",
                "մոլորակ",
                "շտապել",
                "գլխավոր",
                "գաղութ",
                "ժամացույց",
                "ոքի",
                "մտնել",
                "թարմ",
                "որոնում",
                "ատրճանակ",
                "թույլ տալ",
                "տպել",
                "մեռած",
                "տեղում",
                "անապատ",
                "կոստյում",
                "ընթացիկ",
                "վերելակների",
                "վարդ",
                "ժամանել",
                "վարպետ",
                "շավիղ",
                "ծնող",
                "ափը",
                "բաժին",
                "թերթ",
                "նյութ",
                "կողմ",
                "միացնել",
                "հաղորդագրություն",
                "ծախսել",
                "կապան",
                "ուրախ",
                "օրիգինալ",
                "բաժնետոմս",
                "կայան",
                "հայրիկ",
                "հաց",
                "անվճար",
                "ճիշտ",
                "բար",
                "առաջարկ",
                "հատված",
                "ստրուկ",
                "բադ",
                "ակնթարթ",
                "շուկա",
                "աստիճան",
                "բնակեցնել",
                "չիկ",
                "սիրելի",
                "թշնամի",
                "պատասխանել",
                "տեղի ունենալ",
                "աջակցություն",
                "խոսք",
                "բնություն",
                "շարք",
                "գոլորշի",
                "միջնորդությունը",
                "ճանապարհը",
                "հեղուկ",
                "մուտք",
                "քանորդ",
                "ատամիկ",
                "վահանակ",
                "պարանոց",
                "թթվածին",
                "շաքար",
                "մահվան",
                "բավականին",
                "հմտություն",
                "կանայք",
                "սեզոն",
                "լուծում",
                "մագնիս",
                "արծաթ",
                "մասնաճյուղ",
                "վերջածանց",
                "հատկապես",
                "թուզ",
                "վախենում",
                "հսկայական",
                "քույր",
                "պողպատ",
                "քննարկել",
                "ուղեցույց",
                "փորձառություն",
                "հաշիվը",
                "խնձոր",
                "գնել",
                "առաջնորդվում",
                "սկիպիդար",
                "վերարկու",
                "զանգված",
                "հարցաթերթիկ",
                "բլանկ",
                "հաղթանակ",
                "երազ",
                "երեկո",
                "վիճակ",
                "վարդեր",
                "հիմնական",
                "հոտ",
                "հովիտ",
                "կրկնակի",
                "օջախ",
                "շարունակել",
                "թաղամաս",
                "աղյուսակը",
                "գլխարկը",
                "վաճառել",
                "հաջողություն",
                "ընկերությունը",
                "հանել",
                "իրադարձություն",
                "մասնավորապես",
                "զբաղվել",
                "լողալը",
                "ժամկետ",
                "հակադիր",
                "պայտ",
                "բոթել",
                "տարածումը",
                "դասավորել",
                "ճամբար",
                "հնարել",
                "բամբակ",
                "ծնված",
                "կվարտա",
                "ինը",
                "բեռնատար",
                "մեքենա",
                "աղմուկ",
                "մակարդակ",
                "շանս",
                "ձգվել",
                "փայլ",
                "սեփականություն",
                "սյունակ",
                "մոլեկուլ",
                "սխալ",
                "գորշ",
                "կրկնել",
                "պահանջում",
                "պատրաստել",
                "աղ",
                "քիթը",
                "հոգնակի",
                "զայրույթը",
                "պահանջը",
                "անարատ",
                "կապիկ",
                "գնդիկ",
                "մկնիկ",
                "ուսուցիչ",
                "փրկիչ",
                "հսկիչ",
                "չամիչ",
                "սափրիչ",
                "տիկնիկ",
                "պուպրիկ",
                "փիսիկ",
                "կողով"};
    }

    public void getResponse(String input) {
        input = input.trim();
        int hyphenCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '-') {
                hyphenCount++;
            }
        }
        // Error Responses
        if (input.length() == 0) {
            System.out.println("\nPlease specify what you would like to search\n");
        }
        else if (!(input.endsWith("-")) && input.charAt(0) != '-'){
            System.out.println("\nMake sure you use \"-\" before or after your search.");
        }
        else if (input.endsWith("-") && input.charAt(0) == '-') {
            //wordSearch(input);
            System.out.println("\nMake sure you only use 1 \"-\" in your search.");
        }
        else if (hyphenCount > 1) {
            System.out.println("\nMake sure you only use 1 \"-\" in your search.");
        }
        // Functions
        else if (input.equals("# of words")) {
            wordCount();
        }
        else if (input.charAt(0) == '-') {
            endSearch(input);
        }
        else if (input.endsWith("-")) {
            forwardSearch(input);
        }
    }

    private void forwardSearch(String searchTerm) {
        wordsFound = 0;
        searchTerm = searchTerm.toLowerCase();
        
        for (String term : armenianWords) {
            term = term.toLowerCase();
            if (searchTerm.length()-1 < term.length() && term.substring(0,
                    searchTerm.length()-1).equals(searchTerm.substring(0, searchTerm.length()-1))) {
                System.out.println(term);
                wordsFound++;
            }
        }

        if (wordsFound == 0) {
            System.out.println("\nEither there are no words in this program that match your " +
                    "search case or the program made a mistake. Please try again.");
        }
    }

    private void endSearch(String searchTerm) {
        wordsFound = 0;
        searchTerm = searchTerm.toLowerCase();
        
        for (String term : armenianWords) {
            term = term.toLowerCase();
            if (searchTerm.length()-1 < term.length() && term.substring(term.length() - (searchTerm.length()-1)).equals(searchTerm.substring(1))) {
                System.out.println(term);
                wordsFound++;
            }
        }

        if (wordsFound == 0) {
            System.out.println("\nEither there are no words in this program that match your " +
                    "search case or the program made a mistake. Please try again.");
        }
    }

    private void wordSearch(String searchTerm) {
        // This method should search for a word but we cant use binary search and linear search would take way too long to complete the task.
    }

    private void wordCount() {
        System.out.println("\nThis program currently has " + (words.size()) + " Armenian words.");
    }
}
