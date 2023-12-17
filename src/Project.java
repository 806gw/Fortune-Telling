import java.util.Random;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        String fortuneTelling;
        Scanner scanner = new Scanner(System.in);

        String[] MouseFortune = {
                "지금 계획하거나 실행한고 있는 일은 반드시 좋은 결과를 가져온다.",
                "다만 정도를 걷지 않으면 우환이 생긴다. 동산에 투자하는 것이 유리하다.",
                "장기간 자금이 묶이면 곤란해진다." ,
                "친한 사람을 맹목적으로 믿는다면 그의 잔꾀에 실패할 수 있다.",
                "사무실 이전이나 이사를 해도 좋은 때다."
        };
        Random random = new Random();
        int index = random.nextInt(MouseFortune.length);
        String selectedFortune = MouseFortune[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune = {
                "일이 꼬여 가는 듯한 느낌이면 이사를 하거나 가구 배치를 바꾸도록 하라. 생각이 얕으면 잘하려했던 것들도 잘못될 수밖에 없다.",
                "적지 않은 돈을 만지지만 모두 남의 것이다.",
                "건강했던 사람도 무기력해지고 상태가 악화될 수 있다.",
                "대형 사고가 발생하거나 큰 다툼이 일어날 소지가 많으니 매사에 조심.",
                "개운(開運)을 위한 조언 : 자신의 한계를 넘어서지 마라. "
        };
        Random random1 = new Random();
        int index1 = random.nextInt(CowFortune.length);
        String selectedFortune1 = CowFortune[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune = {
                "참된 운명이란 나아갈 때와 물러날 때를 알아야 하는 것. 전반적으로 조금 어려운 시기다.",
                "하지만 세상살이 힘들다고 한탄하고 있을 수만은 없는 일. 인간관계는 등산을 하듯이 꾸준한 페이스를 유지하고 권고를 못이기는 척 응하라.",
                "매사 서두르지 말고 상황을 지켜보면서 대응하라.",
                "자존심을 조금만 죽일 것. 신규 투자는 하지 마라."
        };
        Random random2 = new Random();
        int index2 = random.nextInt(TigerFortune.length);
        String selectedFortune2 = TigerFortune[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune = {
                "이제는 숨을 고르면서 재충전의 시간을 가져라. 신규 투자는 하지 마라.",
                "분에 넘치는 재물을 추구하면 명예가 손상되고 손해만 있다.",
                "어쩔 수 없이 함께 일하면 마음을 열지 말라.",
                "곧 그대의 소원을 풀 수 있게 되리라.",
                "사업에는 적극적이되 처신을 올바르게 하여 구설이 없도록 해야 한다. 그럼에도 시비가 있다면 과감히 맞서라.",
                "함께 일하는 사람에게 마음을 쉽게 보이지 마라."
        };
        Random random3 = new Random();
        int index3 = random.nextInt(RabbitFortune.length);
        String selectedFortune3= RabbitFortune[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune = {
                "과도한 욕심만 부리지 않는다면 원하는 바를 이룰 수 있다.",
                "절대 노력을 게을리 해서는 안 된다. 한번쯤 천재일우와 같은 기회가 온다.",
                "기회를 놓치지 않도록 하라. 남들이 보기에는 별 것 아닌 듯싶지만 도처에서 실속을 챙기게 된다.",
                " 조건이 맞으면 즉시 결정을 내리고 추진하라. 다만 건강은 유의하라."
        };
        Random random4 = new Random();
        int index4 = random.nextInt(DragonFortune.length);
        String selectedFortune4 = DragonFortune[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune = {
                "매사 한 박자 늦추는 여유를 갖고 넉넉한 마음으로 설계하라.",
                "동업을 하고 있다면 영역을 확실히 구분하여 업무 처리를 효율적으로 하라.",
                "직장을 옮기거나 새로운 일을 하면 좋지 않다.",
                "적극적인 행동보다 소극적인 처세가 유리하다.",
                "적은 돈이라도 착실히 모으도록하라.",
                "친한 사람을 각별히 조심하라. 이해관계가 얽혀 의리가 상한다.",
                "가능한 한 현재의 자리를 지키도록 하라. 두통이 생기거나 시력이 저하될 수 있다."
        };
        Random random5 = new Random();
        int index5= random.nextInt(SnakeFortune.length);
        String selectedFortune5 = SnakeFortune[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune = {
                "가까운 사이일수록 기본적인 예의는 지켜라. ",
                "눈앞에 나타난 현상에 흔들리지 말고 자신감을 가져라. ",
                "달콤한 말에 솔깃하여 앞 뒤 재지 않고 행동하다가 큰 코 다칠 수 있다.",
                "피해는 혼자 보는 것이 아니라 주위 사람 모두 함께 보게 된다.",
                "형제들과 화목하게 지내지 못했다면 화해하라.",
                "장거리 출장과 여행은 대중교통을 이용하라."
        };
        Random random6 = new Random();
        int index6= random.nextInt(HorseFortune.length);
        String selectedFortune6 = HorseFortune[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune = {
                "친한 친구사이일수록 절대 금전거래를 하지 마라.",
                "남의 돈을 쓰다가 큰 화근이 된다. ",
                "머릿속은 분주하나 현실은 따라 주지 않으니 정신적인 고통이 크다.",
                "영업을 확장할 시기가 아니다. ",
                "정확한 것은 좋지만 지나치게 타산적이면 인심을 잃는다.",
                "상황은 한 치 앞을 알 수 없을 정도로 급박하게 돌아가는데 전혀 알고 있지 못하니 안쓰럽기 그지없다."
        };
        Random random7 = new Random();
        int index7= random.nextInt(SheepFortune.length);
        String selectedFortune7 = SheepFortune[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune = {
                "첫 단추를 잘 끼워라. 조금 잘못되면 천 리나 어긋난다.",
                "추진하는 일은 성사될 가능성이 높다. 하지만 남쪽은 피하라. ",
                "무책임한 말이 화근이 되어 많은 재물을 잃을 수 있으니 주의하라.",
                "번거롭게 일을 벌이지 말고 수습하는 쪽에 신경을 쓰도록 하라. ",
                "피곤하고 마음이 안정되지 않아서 방심하다가 부상이나 사고를 당할 수 있다."
        };
        Random random8 = new Random();
        int index8= random.nextInt(MonkeyFortune.length);
        String selectedFortune8 = MonkeyFortune[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune = {
                "베푸는 마음으로 타협하면 승리한다. ",
                "판매나 업무 능력이 향상되어 자신의 능력을 인정받을 수 있는 기회가 생긴다.",
                "포기했던 돈을 갑자기 받지만, 일부분만 받을 수 있다.",
                "청탁을 받으면 정중하게 거절하고, 작은 것을 버리는 지혜를 발휘하라. ",
                "전문가의 말이라도 맹신하지 말라. ",
                "무심결에 던진 한마디가 상대의 마음을 아프게 한다. ",
                "사과하지 않으면 회복하기 어렵다."
        };
        Random random9 = new Random();
        int index9= random.nextInt(ChickenFortune.length);
        String selectedFortune9 = ChickenFortune[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune = {
                "오래도록 고민하던 일이 서서히 회복의 기미를 보인다.",
                "주위에 자신의 재능을 알려라. 당신을 찾고 있는 사람이 가까이 있다.",
                "일은 바쁘고 정신없이 돌아가지만 결과는 기대에 못 미친다.",
                "자신의 속마음을 보이지 마라.",
                "직장을 옮기거나 새로운 일을 구하는 것은 당분간은 힘들다.",
                "꼭 필요한 경우가 아니라면 몸을 혹사하지 마라.",
                "집을 수리하거나 이사를 하는 것은 피해라."
        };
        Random random10 = new Random();
        int index10= random.nextInt(DogFortune.length);
        String selectedFortune10 = DogFortune[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune = {
                " 그 동안 어려웠던 재정 상태도 원만하게 풀리니 평소에 하고 싶었던 일은 적극적으로 추진하라.",
                "다만 청탁이 있으면 즉답을 피하도록 하라. ",
                "하고자 하는 일은 풀리기 시작하고 등졌던 사람도 다시 찾아온다. ",
                "고집부리지 말고 상대를 배려하도록. ",
                "중병으로 신음하는 사람은 극단의 조치를 취하라. ",
                "산이 가로막지만 귀인의 도움으로 필히 성공하게 되리라."
        };
        Random random11 = new Random();
        int index11= random.nextInt(PigFortune.length);
        String selectedFortune11 = PigFortune[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        // --------------------------------------------------------------------------- \\

        String[] MouseFortune_february = {
                "용기와 인내심이 필요한 시기이다.",
                "숨겨왔던 잘못이 드러날 수 있는데 끝까지 감추려고 하기보다는 용기를 내서 어느 정도 인정하고 물러나는 자세가 필요하다.",
                "잘못을 피해 가긴 힘들 수 있지만 이를 통해 한 단계 더 성숙해질 수 있다.",
                "기에 성과를 낼 수 있으나 욕심이 과하면 본전도 찾기 어려울 수 있으니 명심해라.",
                "즉흥적으로 판단해선 후회만 따른다."
        };
        Random random12 = new Random();
        int index12 = random.nextInt(MouseFortune_february.length);
        String selectedFortune12 = MouseFortune_february[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_february = {
                "컨디션이 안 좋은 시기이니 무리하게 체력을 낭비하는 것은 별로 좋지 않다.",
                "어딘가에 외출하기보다는 일이 끝나면 집으로 돌아와서 심신을 달래는 것이 좋다.",
                "연장자나 먼저 경험한 사람으로부터 도움이 되는 것을 배울 기회가 찾아오니 이를 놓치지 말고 배울 필요가 있다."
        };
        Random random13 = new Random();
        int index13 = random.nextInt(CowFortune_february.length);
        String selectedFortune13 = CowFortune_february[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_february = {
                "다른 것보다 학업운이 안 좋은 시기이니 준비하고 있던 시험이 있다면 평소보다 더 안 좋은 결과를 얻을 수 있다.",
                "남들이 보기엔 부러울 수 있지만 내 입장에선 책임이 클 수 있으니 신중해야한다.",
                "이직이나 이사 등 이동에 길한 달이니 기회가 있다면 빠르게 움직여보아라.",
                " 피하기보단 맞서는 것이 좋습니다. 문자 보단 전화, 전화보단 대면 함이 유리하다."
        };
        Random random14 = new Random();
        int index14 = random.nextInt(TigerFortune_february.length);
        String selectedFortune14 = TigerFortune_february[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_february = {
                "내가 먼저 주도적으로 이끌어야 행운도 따라온다.",
                "경쟁자가 많아 걱정되더라도 정직한 사람이 이기게 되어 있다. 편법은 삼가해라.",
                "말 한마디에 천냥 빚을 갚는다는 것을 느낄 수 있을 것이다. 부드럽게 대화를 주도해봐라.",
                "굳이 내가 애쓰지 않아도 주변에서 모두 알아줄것이다.",
                "신기할정도로 불행과 행복은 붙어 다닐것이다."
        };
        Random random15 = new Random();
        int index15 = random.nextInt(RabbitFortune_february.length);
        String selectedFortune15 = RabbitFortune_february[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_february = {
                "마음 속 이야기를 꺼내봐도 좋을것이다. 좋은 작용으로 돌아올테니 숨기지 마라.",
                "다른 사람 일에 오지랖 부리다간 내 일을 멀리 할 수있다. 자기 자신에게만 생각해라.",
                "갈등을 피해가기 위해선 입을 무겁게하고 지킬 수 있는 약속만 하는 것이 좋을것이다.",
                " 첫 인상에 마음에 들지 않지만 갈수록 매력을 발견할 수 있으니 오래보길 바란다."
        };
        Random random16 = new Random();
        int index16 = random.nextInt(DragonFortune_february.length);
        String selectedFortune16 = DragonFortune_february[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_february = {
                "내 자존심보단 내 곁에 있는 사람들을 선택하는게 좋을것이다.",
                "주변이 정리되지 않아서 집중 하기 힘들것이다. 하루정도 정리하는 날이 필요하다.",
                "시너지를 낼 수 있는 좋은 사람과 인연이 있다. 사람 대함에 인색하지 말아라.",
                "먹을 복이 많은 날이니 사람을 만나거나 여행을 가는 등 많이 움직여보는걸 추천한다.",
                " 물 만난 물고기처럼 내 재량을 뽐낼 수 있을테니 아직은 준비단계로 삼아야 합니다."
        };
        Random random17 = new Random();
        int index17 = random.nextInt(SnakeFortune_february.length);
        String selectedFortune17 = SnakeFortune_february[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_february = {
                "지금 현실을 냉철하게 판단하여 허황된 생각을 버리는 것이 좋다. ",
                "모든 일의 성사보다는 본인의 마음가짐이 중요하다. ",
                "배신이나 사기를 당할 수 있으니 주의해라.",
                "어려움이 있어도 희망을 버리지 않는 마음이 중요하다.",
                "능력이상의 것을 바라고 희망하면 근심만 쌓인다."
        };
        Random random18 = new Random();
        int index18 = random.nextInt(HorseFortune_february.length);
        String selectedFortune18 = HorseFortune_february[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_february = {
                "주변의 도움을 받으니 모든 일이 뜻대로 된다.",
                "해결되지 않는 문제가 없다.",
                "자손들이 기쁨을 가져오고 하늘에서도 복을 내린다.",
                "크게 생각했던 병도 정확한 검진을 하고 나면 가벼운 병이다.",
                "전업을 생각했다면 다시 한 번 생각하는 것이 좋을 것이다."
        };
        Random random19 = new Random();
        int index19= random.nextInt(SheepFortune_february.length);
        String selectedFortune19 = SheepFortune_february[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_february = {
                "늦을수록 복이 들어온다. 길에 위험이 많으니 주의해라.",
                "처음에는 가망없어 보이던 병이 시간이 지날수록 조금씩 낫게 되리라.",
                "까치가 아침에 좋은 소식을 가져오니 기다리던 소식이 들려온다.",
                "하늘이 복을 주고 행하려 하는 것을 이루니 기쁨이 곱절이다.",
                "시비를 가까이 하지 마라. 구설수가 따를 것이니 사람 교체에 주의해라."
        };
        Random random20 = new Random();
        int index20 = random.nextInt(MonkeyFortune_february.length);
        String selectedFortune20 = MonkeyFortune_february[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_february = {
                "분수에 맞는 목표를 세워라. 마음만 앞서고 성과가 없을 수 있다.",
                "안 되는 일이 없고 부귀와 명예가 따른다. 대길한 운이다.",
                "한두 가지 일에 희망을 걸고 부지런히 뛰어 다녀라.",
                "안 되는 일이 없고 부귀와 명예가 따른다. 대길한 운이다.",
                "이루고자 하는 간절한 믿음이 있으니 크게 이루게 된다.",
                "여행하기엔 모든 방향이 매우 길하며 액운이나 장애가 없다."
        };
        Random random21 = new Random();
        int index21 = random.nextInt(ChickenFortune_february.length);
        String selectedFortune21 = ChickenFortune_february[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_february = {
                "모든 일이 어수선하고 불길하니 조심해라.",
                "불의의 사고가 우려되니 경거망동하지 말고 자중해라.",
                "집안에 불길한 기운이 감도니 화합에 힘써라.",
                "한번 쓰러지면 일어서기 힘드니 각별히 몸조심해라.",
                "작은 소원도 이루기가 어려우니 무리한 추진이나 행동은 삼가도록 해라."
        };
        Random random22 = new Random();
        int index22 = random.nextInt(DogFortune_february.length);
        String selectedFortune22 = DogFortune_february[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_february = {
                "신념을 가지고 이끌어 나가야 한다.",
                "꾀하는 일마다 마(魔)가 서려있으니 조심해라.",
                "잠시 일을 멈추고 마음을 비울 수 있도록 기도해라.",
                "적지 않은 손해를 입게 되니 마음이 안타깝다.",
                "헛된 꿈이나 욕망은 삼가도록 해라."
        };
        Random random23 = new Random();
        int index23 = random.nextInt(PigFortune_february.length);
        String selectedFortune23 = PigFortune_february[index];

        // ------------------------------------------------------------\\

        String[] MouseFortune_March = {
                "지금 현실을 냉철하게 판단하여 허황된 생각을 버리는 것이 좋다.",
                "모든 일의 성사보다는 본인의 마음가짐을 중요한 것이다.",
                "믿었던 친구나 동료에게 배신이나 사기를 당하여 부도를 내게 된다." ,
                "기회를 놓치고 이루기 어려우나 희망을 버리지 않는 마음이 중요할 것이다.",
                "능력 이상의 것을 바라고 희망하니 근심만 쌓인다."
        };
        Random random24 = new Random();
        int index24 = random.nextInt(MouseFortune_March.length);
        String selectedFortune24 = MouseFortune_March[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_March = {
                "주변인들이 스스로 도우니 모든 일이 뜻대로 된다.",
                "해결되지 않는 문제가 없다",
                "크게 생각했던 병도 정확한 검진을 하고 나면 가벼운 병이다.",
                "전업을 생각했다면 다시 한 번 생각하는 것이 낳을 것이다."
        };
        Random random25 = new Random();
        int index25 = random.nextInt(CowFortune_March.length);
        String selectedFortune25 = CowFortune_March[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_March = {
                "길을 나섰지만 길가엔 위험만이 도사리고 있다.",
                "처음에는 가망 없어 보이던 병이 시간이 지날수록 조금씩 낫게 되리라.",
                "까치가 아침에 좋은 소식을 가져오니 기다리던 소식이 들려오고 성취되리라.",
                "하늘이 복을 주고 행하려 하는 것을 이루니 기쁨이 곱절이다."
        };
        Random random26 = new Random();
        int index26 = random.nextInt(TigerFortune_March.length);
        String selectedFortune26 = TigerFortune_March[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_March = {
                "여러 가지 꿈을 좇으려 하지만 모두 다 이루기는 어렵다.",
                "한두 가지 일에 희망을 걸고 부지런히 뛰어 다녀라.",
                "안 되는 일이 없고 부귀와 명예가 따른다. 대길한 운이다.",
                "간절한 믿음이 있으니 크게 이루게 된다.",
                "여행하기엔 모둔 방향이 매우 길하며 액운이라든가 장애가 없다."
        };
        Random random27 = new Random();
        int index27 = random.nextInt(RabbitFortune_March.length);
        String selectedFortune27 = RabbitFortune_March[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_March = {
                "모든 일이 어수선하고 불길하다.",
                "불의의 사고가 우려되니 경망된 행동은 삼가 해야겠다.",
                "집안에 불길한 기운이 감도니 주의를 기울이도록 하라.",
                "한번 쓰러지면 일어서기 힘드니 각별히 몸조심하라.",
                "작은 소원도 이루기가 어려우니 무리한 추진이나 행동은 삼가도록 하라."
        };
        Random random28 = new Random();
        int index28 = random.nextInt(DragonFortune_March.length);
        String selectedFortune28 = DragonFortune_March[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_March = {
                "신념을 가지고 매사를 이끌어 나가라.",
                "꾀하는 일마다 마(魔)가 서려 있다.",
                "잠시 일을 멈추고 마음을 비우고 신께 기도나 올리도록 하라.",
                "적지 않은 손해를 입게 된다.",
                "헛된 꿈이나 욕망은 삼가도록 하라."
        };
        Random random29 = new Random();
        int index29= random.nextInt(SnakeFortune_March.length);
        String selectedFortune29 = SnakeFortune_March[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_March = {
                "소송에 걸려 법원 출입하느라 몸이 편안할 날이 없겠다.",
                "토지나 가옥 등의 거래가 화근이 되어 송사에 시달리는 경우가 종종 발생하게 된다.",
                "뚜렷한 방편은 생각나지 않아 불안하니 도움을 청해라.",
                "거듭 실패가 계속된다. 이에 따르는 적자도 심각할 사태에 이르게 된다.",
                "과로를 피하고 잠시 휴양을 취하는 시간이 필요하다."
        };
        Random random30 = new Random();
        int index30 = random.nextInt(HorseFortune_March.length);
        String selectedFortune30 = HorseFortune_March[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_March = {
                "당당하던 기세가 한풀 꺾일 때이다.",
                "열매를 따내었으니 가지가 허전함은 당연한 일이다.",
                "자금순환이 힘들뿐만 아니라 도와주던 이도 하나둘씩 떠나가기 시작한다.",
                "겨울이 지나면 따뜻한 봄날은 다시 찾아오기 마련이다.",
                "근신하며 수양에 힘쓰도록 하라."
        };
        Random random31 = new Random();
        int index31= random.nextInt(SheepFortune_March.length);
        String selectedFortune31 = SheepFortune_March[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_March = {
                "좋은 운은 늘 오지 않는다.",
                "병은 초기에 발견해야 빨리 낫고 치료도 정확히 할 수 있는 것이다.",
                "개업이나 전업은 흉하다.",
                "취직은 서둘렀어야 했다. 되지 않는다.",
                "집안에서 근신하며 앞날의 계획을 도모함이 좋겠다."
        };
        Random random32 = new Random();
        int index32= random.nextInt(MonkeyFortune_March.length);
        String selectedFortune32 = MonkeyFortune_March[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_March = {
                "괴이한 곳에 가지마. 질병이 생길까 두렵다.",
                "동쪽에서 온 사람과는 반드시 원수가 된다.",
                "인정으로 인해 해를 당하리니 냉정하게 판단하라.",
                "취직은 낮은 데로 지원했다면 합격이다.",
                "마음이 안락하니 모든 일이 순조로이 이루어지고 희망적일 것이다."
        };
        Random random33 = new Random();
        int index33 = random.nextInt(ChickenFortune_March.length);
        String selectedFortune33 = ChickenFortune_March[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_March = {
                "지금까지 기다렸다면 조금 더 참고 기다리는 것이 좋겠다.",
                "늦게나마 만사가 풀리게 되겠다. 포기하지 말고 기다려라.",
                "사업은 지금까지 하던 방식대로 꾸준히 하는 것이 좋다.",
                "새롭게 개업을 한다든지, 직업을 바꾸는 것은 좋지 못하다.",
                "일신(一身)이 지치기는 하나 남을 해하고 이득을 보려 하지 않으니 사람들의 도움을 받는다."
        };
        Random random34 = new Random();
        int index34 = random.nextInt(DogFortune_March.length);
        String selectedFortune34 = DogFortune_March[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_March = {
                "객지에 오랜 고생 끝에 금의환향(錦衣還鄕)하는 운세이다.",
                "재물과 이윤이 왕성하여 부러울 것이 없겠다.",
                "원대한 소원이 비로소 이루어진다.",
                "몸가짐에 주의해야 하는 부담이 따르게 된다.",
                "불의 사고를 조심하고 남과의 사소한 시비를 주의하여라."
        };
        Random random35 = new Random();
        int index35= random.nextInt(PigFortune_March.length);
        String selectedFortune35 = PigFortune_March[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        // --------------------------------------------------------------\\

        String[] MouseFortune_April = {
                "가만있으면 중간이라도 간다. 돌다리도 두르려야 한다.",
                "가까운 이들이 떠나는구나.",
                "매사에 조심하라. 두 번 세 번 확인하라." ,
                "부정한 방법은 마음에 담아 두지 마라.",
                "떠난 연인은 돌아오지 않는다. 기다리지 말라."
        };
        Random random36 = new Random();
        int index36 = random.nextInt(MouseFortune_April.length);
        String selectedFortune36 = MouseFortune_April[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_April = {
                "결과만을 보고 행동하지 마라. 앞서가지 마라.",
                "돈은 들어오나 반흉반길이다. 구설을 조심하고 중개인을 통하라.",
                "지출이 늘어난다. 외상이라고 소는 잡아먹어서야 되겠는가?",
                "큰 진전은 없으나 어려운 일이 잘 풀리니 바쁠 것도 없다. 쉬었다 가라.",
                "마음을 달래 줄 벗이 찾아온다."
        };
        Random random37 = new Random();
        int index37 = random.nextInt(CowFortune_April.length);
        String selectedFortune37 = CowFortune_April[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_April = {
                "길을 잃고 방황하나 귀인의 도움으로 해결된다.",
                "시비하지 말라. 사람이 가장 소중한 재산이다.",
                "건강은 회복되나 외출은 삼가라.",
                "하늘이 복을 주니 행함이 곧 기쁨이다."
        };
        Random random38 = new Random();
        int index38 = random.nextInt(TigerFortune_April.length);
        String selectedFortune38 = TigerFortune_April[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_April = {
                "세상에 믿을 이가 드물구나. 경거망동 말지어다.",
                "억지로 하려 말고 기다려라.",
                "한 발작씩 양보하여 화해함이 상책이다.",
                "내 인생의 주인은 자신이다. 소신껏 행동하라.",
                "시기가 좋지 않다. 거래는 연기하라."
        };
        Random random39 = new Random();
        int index39 = random.nextInt(RabbitFortune_April.length);
        String selectedFortune39 = RabbitFortune_April[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_April = {
                "꾀꼬리가 가지위에 깃을 치니 조각조각 황금이다. 재물과 영화가 찾아온다. 단 구설을 조심하라.",
                "주위의 도움을 청하라. 들어줄 것이다.",
                "기다리지 말고 움직여라. 단 서쪽은 금하라.",
                "어려운 시험에 합격한다."
        };
        Random random40 = new Random();
        int index40 = random.nextInt(DragonFortune_April.length);
        String selectedFortune40 = DragonFortune_April[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_April = {
                "고진감래라 하였다. 희망을 가지라.",
                "귀인이 찾아오니 반갑게 맞이하라.",
                "남에게 이야기 하지 마라, 마음만 더 아프구나.",
                "건강한 몸에 밝은 지혜가 있다.",
                "운이 좋으니 가는 곳마다 좋은 일이 생긴다."
        };
        Random random41 = new Random();
        int index41= random.nextInt(SnakeFortune_April.length);
        String selectedFortune41 = SnakeFortune_April[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_April = {
                "상하가 단결하여 만사형통이다.",
                " 뜻밖의 일로 쉽게 이루어진다. 부귀공명 누리는구나.",
                "지는 것이 이기는 것이다. 경쟁심을 버려라.",
                "꼭 가야만 되는 경우가 아니면 여행은 삼가하는 것이 좋겠다.",
                "직장이나 취직 관련하여 좋은 소식을 듣게 된다."
        };
        Random random42 = new Random();
        int index42 = random.nextInt(HorseFortune_April.length);
        String selectedFortune42 = HorseFortune_April[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_April = {
                "사치하지 말라. 검소의 미덕이 제일이다.",
                "혈압이나 스트레스 주의해야 한다.",
                "자존심을 버려라.",
                "가끔씩은 상대에게 빈틈을 보이는 여유를 가지라.",
                "생각지 못한 횡재수가 있다."
        };
        Random random43 = new Random();
        int index43 = random.nextInt(SheepFortune_April.length);
        String selectedFortune43 = SheepFortune_April[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_April = {
                "과감히 밀고 나가라. 상하가 협조한다.",
                "오늘만큼은 차량사고 조심하라.",
                "고생 끝에 낙이 온다. 단 부정한 생각은 버려라.",
                "마음을 바르게 하라. 이익이 있으리라.",
                "이성과의 만남은 있으나 서로가 갈등만 있다."
        };
        Random random44 = new Random();
        int index44 = random.nextInt(MonkeyFortune_April.length);
        String selectedFortune44 = MonkeyFortune_April[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_April = {
                "아랫사람에게 관심을 가져라.",
                "좋은 흐름에 있으니 이익을 얻는다.",
                "헛된 재물을 탐하지 말라.",
                "작은 것이 쌓여 큰 것을 이루니 차근차근 성취하라.",
                "유흥에 주의하라. 괜한 시비에 휘말리게 된다."
        };
        Random random45 = new Random();
        int index45 = random.nextInt(ChickenFortune_April.length);
        String selectedFortune45 = ChickenFortune_April[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_April = {
                "오늘 하루 쉬어가라. 내일은 번창하리라.",
                "내 것인 줄 알았는데 옛 주인이 따로 있다.",
                "시비에 가담치 마라. 불리하다.",
                "노력에 공전하고 손실이 있겠다. 나중으로 연기하라.",
                "약속을 지켜라. 불가하면 사전에 양해를 얻어 구설을 차단하라."
        };
        Random random46 = new Random();
        int index46 = random.nextInt(DogFortune_April.length);
        String selectedFortune46 = DogFortune_April[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_April = {
                "소망이 너무 크다. 작은 것에 집중해라.",
                "오래전 병이 발병할 수 있다. 주의하라.",
                "많은 사람들 앞에서 자신의 재능을 뽐낼 수 있다.",
                "욕심을 버리고 작은 것에 만족하라.",
                "좋은 인연을 소개받게 된다."
        };
        Random random47 = new Random();
        int index47= random.nextInt(PigFortune_April.length);
        String selectedFortune47 = PigFortune_April[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        // ------------------------------------------------------------\\

        String[] MouseFortune_May = {
                "다른 사람의 말에 이리 저리 흔들리지 마세요. 매사에 자신의 주관을 확실히 하는 것이 좋습니다.",
                "장기적인 안목과 넓은 시야가 필요한 시기입니다. 눈 앞의 이익보다는 먼 미래를 내다 보세요.",
                "혼자서 모든 것들을 해결하려고 하지 마세요. 어려운 일은 주위의 힘을 빌리는 것이 좋습니다." ,
                "새로운 지위나 명예를 얻을 수 있는 시기입니다. 자신의 실력과 재능을 마음껏 발휘해 보세요.",
                "한 눈 팔지 말고 현재 자신의 일에 집중하세요. 새로운 일이나 변화는 피하는 것이 좋습니다."
        };
        Random random48 = new Random();
        int index48 = random.nextInt(MouseFortune_May.length);
        String selectedFortune48 = MouseFortune_May[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_May = {
                "장기적인 안목과 넓은 시야가 필요한 시기입니다. 눈 앞의 이익보다는 먼 미래를 내다 보세요.",
                "남이 가진 것을 탐하거나 부러워하지 마세요. 현재 가진 것에 적당히 만족하는 것이 좋습니다.",
                "성실하고 책임감 있는 모습이 필요한 시기입니다. 한번 맡은 일은 끝까지 책임지도록 하세요.",
                "다른 사람의 말이나 약속을 함부로 믿지 마세요. 남의 말을 믿었다가 손해를 볼 수 있어요."
        };
        Random random49 = new Random();
        int index49 = random.nextInt(CowFortune_May.length);
        String selectedFortune49 = CowFortune_May[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_May = {
                "아무리 가까워도 맺고 끊는 것을 확실히 하세요. 특히 금전 거래나 보증은 삼가는 것이 좋습니다.",
                "2보 전진을 위해 1보 후퇴가 필요한 시기입니다. 일이나 사업보다 휴식과 재충전에 힘쓰세요.",
                "다른 사람의 일이나 책임을 대신 떠안지 마세요. 실컷 고생하고 남 좋은 일만 할 수도 있어요.",
                "선택과 집중을 확실히 해야 하는 시기입니다. 일의 경중과 우선 순위를 잘 따져서 움직이세요."
        };
        Random random50 = new Random();
        int index50 = random.nextInt(TigerFortune_May.length);
        String selectedFortune50 = TigerFortune_May[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_May = {
                "아무리 마음이 급해도 서두르거나 조급해 하지 마세요. 여유를 갖고 느긋하게 대처하는 것이 좋습니다.",
                "받으려고 하기보다 먼저 베풀어야 하는 시기입니다. 작은 돈이나 재물에 너무 연연하지 마세요.",
                "혼자서 모든 것들을 해결하려고 하지 마세요. 어려운 일은 주위의 힘을 빌리는 것이 좋습니다.",
                "새로운 지위나 명예를 얻을 수 있는 시기입니다. 자신의 실력과 재능을 마음껏 발휘해 보세요.",
                "한 눈 팔지 말고 현재 자신의 일에 집중하세요. 새로운 일이나 변화는 피하는 것이 좋습니다."
        };
        Random random51 = new Random();
        int index51 = random.nextInt(RabbitFortune_May.length);
        String selectedFortune51 = RabbitFortune_May[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_May = {
                "과유불급, 매사에 지나침을 삼가야 하는 시기입니다. 더도 말고, 덜도 말고 적당히 중간만 하세요.",
                "다른 사람에게 너무 기대거나 의지하지 마세요. 자신의 일은 자신이 해결하는 것이 좋습니다.",
                "좋은 기회나 행운이 찾아오는 시기입니다. 뜻하지 않은 재물을 얻거나 횡재를 할 수 있어요.",
                "노력에 비해 성과가 부족해도 실망하지 마세요. 결과보다는 과정을 중시하는 것이 좋습니다."
        };
        Random random52 = new Random();
        int index52 = random.nextInt(DragonFortune_May.length);
        String selectedFortune52 = DragonFortune_May[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_May = {
                "새로운 일이나 계획을 시작하기에 좋은 때입니다. 늦었다고 포기하지 말고 이제라도 시작해 보세요.",
                "언제 어디서든 여유와 미소를 잃지 마세요. 긍정적이고 낙관적인 모습을 보이는 것이 좋습니다.",
                "과거보다 현재와 미래를 중시해야 하는 시기입니다. 지난 일이나 과거에 미련을 갖지 마세요.",
                "인보다는 조직이나 단체를 먼저 생각하세요. 대를 위해서는 소를 희생해야 할 수도 있어요.",
                "자신의 실력과 경쟁력을 키워야 하는 시기입니다. 새로운 것을 배우거나 익혀 보도록 하세요."
        };
        Random random53 = new Random();
        int index53 = random.nextInt(SnakeFortune_May.length);
        String selectedFortune53 = SnakeFortune_May[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_May = {
                "돌다리도 두들겨 보고 건너야 하는 시기입니다. 예상치 못한 암초나 장애물이 나타날 수 있어요.",
                "자신에게 이득이 없는 일에는 나서지 마세요. 매사에 이해득실을 잘 따져 보는 것이 좋습니다.",
                "적당한 기분 전환과 스트레스 해소가 필요한 때입니다. 잠시 숨을 돌리며 한 박자 쉬어가세요.",
                "자신이 한 말이나 약속을 잘 지키세요. 지킬 수 없는 약속은 애초에 하지 않는 것이 좋습니다.",
                "대인운과 애정운이 아주 좋은 시기입니다. 짝이 없는 분들은 천생연분을 만날 수도 있어요."
        };
        Random random54 = new Random();
        int index54 = random.nextInt(HorseFortune_May.length);
        String selectedFortune54 = HorseFortune_May[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_May = {
                "그동안의 노력이 하나 둘 결실을 맺는 시기입니다. 잘하면 명예와 재물을 한 손에 거머쥘 수 있어요.",
                "언제 어디서든 예의와 매너를 잃지 마세요. 가까운 사이라도 예의를 잘 지키는 것이 좋습니다.",
                "성실하고 책임감 있는 모습이 필요한 때입니다. 해야 할 일이 있다면 미루지 말고 처리하세요.",
                "자신의 실력이나 재능을 너무 과신하지 마세요. 자칫 평소에 하지 않던 실수를 할 수 있어요.",
                "과감한 결정과 신속한 행동이 필요한 시기입니다. 좋은 기회가 찾아온다면 주저하지 마세요."
        };
        Random random55 = new Random();
        int index55 = random.nextInt(SheepFortune_May.length);
        String selectedFortune55 = SheepFortune_May[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_May = {
                "앉아서 기다리지 말고 먼저 나서서 움직이세요. 적극적이고 진취적인 모습을 보이는 것이 좋습니다.",
                "규칙적인 생활과 철저한 자기 관리가 필요한 시기입니다. 매사에 모범을 보이고 솔선수범하세요.",
                "주위 사람들이나 작은 일상에 관심을 가져 보세요. 작은 정성과 배려가 행운을 가져올 거에요.",
                "노력하면 노력한 만큼 얻을 수 있는 시기입니다. 시간을 낭비하지 말고 부지런히 움직이세요.",
                "다 끝났다고 방심하지 말고 마무리를 철저히 하세요. 꺼진 불도 다시 살펴보는 것이 좋습니다."
        };
        Random random56 = new Random();
        int index56 = random.nextInt(MonkeyFortune_May.length);
        String selectedFortune56 = MonkeyFortune_May[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_May = {
                "작은 일에 일희일비하지 말고 차분하게 대처하세요. 감정적인 말이나 행동은 삼가는 것이 좋습니다.",
                "있는 듯 없는 듯 조용히 지내야 하는 시기입니다. 하고 싶은 말이 있어도 조금 참도록 하세요",
                " 너무 의욕만 내세우거나 남보다 앞서가지 마세요. 적당히 주위와 보조를 맞추는 것이 좋습니다.",
                "공정하고 투명한 일 처리가 필요한 시기입니다. 쉽고 편한 길보다 어렵더라도 바른 길을 가세요.",
                "나서야 할 때와 물러나야 할 때를 잘 구분하세요. 불필요한 말이나 행동은 삼가는 것이 좋습니다."
        };
        Random random57 = new Random();
        int index57 = random.nextInt(ChickenFortune_May.length);
        String selectedFortune57 = ChickenFortune_May[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_May = {
                "주위의 충고나 조언을 잘 따라야 하는 시기입니다. 귀에 거슬리는 말이라도 새겨 듣도록 하세요.",
                "한 두 번의 실패에 좌절하거나 포기하지 마세요. 지금 포기하면 다 잡은 토끼를 놓칠 수 있어요.",
                "매사에 철저한 준비와 계획이 필요한 시기입니다. 예정에 없던 일이나 약속도 피하도록 하세요.",
                "한꺼번에 너무 많은 것을 얻으려고 하지 마세요. 욕심을 부리면 득보다 실이 많을 수도 있어요."
        };
        Random random58 = new Random();
        int index58= random.nextInt(DogFortune_May.length);
        String selectedFortune58 = DogFortune_May[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_May = {
                "너무 원칙만 따지지 말고 적당히 융통성을 발휘하세요. 부드럽고 유연하게 처신하는 것이 좋습니다.",
                "현실적인 목표와 계획이 필요한 시기입니다. 거창한 계획보다는 실현 가능한 목표를 세우세요.",
                "자존심을 앞세우기보다 실속을 중시하세요. 불필요한 경쟁이나 싸움은 피하는 것이 좋습니다.",
                "매사에 신중한 판단과 결정이 필요한 때입니다. 즉흥적인 결정이나 행동은 삼가도록 하세요.",
                "안 되는 일에 매달리거나 미련을 갖지 마세요. 포기해야 할 것은 빨리 포기하는 것이 좋습니다."
        };
        Random random59 = new Random();
        int index59= random.nextInt(PigFortune_May.length);
        String selectedFortune59 = PigFortune_May[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        // --------------------------------------------------------------\\

        String[] MouseFortune_June = {
                "다른 사람의 일에 참견하거나 간섭하지 마세요. 자신의 일이 아니면 그냥 모른 척하는 것이 좋습니다.",
                "기대하지 않은 돈이나 재물이 들어오는 시기입니다. 얻는 것이 있으면 그만큼 베풀도록 하세요.",
                "주위의 달콤한 말이나 유혹에 주의하세요. 매사에 자신의 주관을 확실히 하는 것이 좋습니다." ,
                "매사에 철저한 준비와 계획이 필요한 때입니다. 즉흥적인 결정이나 행동은 삼가도록 하세요.",
                "언제 어디서든 예의와 매너를 잃지 마세요. 가까운 사이라도 예의를 잘 지키는 것이 좋습니다."
        };
        Random random60 = new Random();
        int index60 = random.nextInt(MouseFortune_June.length);
        String selectedFortune60 = MouseFortune_June[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_June = {
                "새로운 각오, 새로운 마음가짐이 필요한 때입니다. 현실에 안주하지 말고 새로운 도전에 나서 보세요.",
                "다른 사람을 무시하거나 얕보지 마세요. 자신보다 못한 사람이라도 존중해 주는 것이 좋습니다.",
                "노력하면 노력한 만큼 얻을 수 있는 시기입니다. 시간을 낭비하지 말고 부지런히 움직이세요.",
                "받으려고 하기보다 먼저 베풀도록 하세요. 돈이나 재물보다 사람을 우선하는 것이 좋습니다."
        };
        Random random61 = new Random();
        int index61 = random.nextInt(CowFortune_June.length);
        String selectedFortune61 = CowFortune_June[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_June = {
                "얻으려고 하기보다는 지켜야 하는 시기입니다. 잘 모르는 일이나 자신 없는 분야에 뛰어들지 마세요.",
                "너무 의욕만 내세우거나 남보다 앞서가지 마세요. 적당히 주위와 보조를 맞추는 것이 좋습니다.",
                "너무 의욕만 내세우거나 남보다 앞서가지 마세요. 적당히 주위와 보조를 맞추는 것이 좋습니다.",
                "말 한 마디, 행동 하나에도 신중을 기하세요. 오해를 부를 만한 언행은 삼가는 것이 좋습니다."
        };
        Random random62 = new Random();
        int index62 = random.nextInt(TigerFortune_June.length);
        String selectedFortune62 = TigerFortune_June[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_June = {
                "물고기가 물을 만났으니 만사가 순조로운 시기입니다. 다른 사람들 눈치보지 말고 소신껏 행동하세요.",
                "고정 관념이나 선입견은 버리도록 하세요. 마음을 열고 새로운 것을 받아 들이는 것이 좋습니다.",
                "고정 관념이나 선입견은 버리도록 하세요. 마음을 열고 새로운 것을 받아 들이는 것이 좋습니다.",
                "앉아서 기다리지 말고 먼저 나서서 움직이세요. 잠시 망설이다가 좋은 기회를 놓칠 수 있어요."
        };
        Random random63 = new Random();
        int index63 = random.nextInt(RabbitFortune_June.length);
        String selectedFortune63 = RabbitFortune_June[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_June = {
                "그동안의 노력이 하나 둘 결실을 맺는 시기입니다. 잘하면 명예와 재물을 한 손에 거머쥘 수 있어요.",
                "일의 경중과 우선 순위를 잘 따져서 움직이세요. 선택과 집중을 확실히 하는 것이 좋습니다.",
                "새로운 지위나 재물을 얻을 수 있는 시기입니다. 목표가 눈 앞에 있으니 조금만 힘을 내세요.",
                "원칙만 따지지 말고 적당히 융통성을 발휘하세요. 부드럽고 유연하게 처신하는 것이 좋습니다."
        };
        Random random64 = new Random();
        int index64 = random.nextInt(DragonFortune_June.length);
        String selectedFortune64 = DragonFortune_June[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_June = {
                "역지사지의 자세가 필요한 시기입니다. 자신의 입장만 내세우지 말고 상대방의 입장에서 생각해 보세요.",
                "너무 자신의 지위나 권위를 내세우지 마세요. 아랫사람의 말에도 귀를 기울이는 것이 좋습니다.",
                "공정하고 투명한 일 처리가 필요한 시기입니다. 남에게 흠 잡힐 만한 일들은 삼가도록 하세요.",
                "말이 많거나 큰 소리치는 사람은 조금 멀리 하세요. 사람을 잘 가려서 만나는 것이 좋습니다.",
                "긍정적이고 낙관적인 모습이 필요한 시기입니다. 언제 어디서든 여유와 미소를 잃지 마세요."
        };
        Random random65 = new Random();
        int index65= random.nextInt(SnakeFortune_June.length);
        String selectedFortune65 = SnakeFortune_June[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_June = {
                "아무리 가까운 사이라도 맺고 끊는 것을 확실히 하세요. 매사에 공과 사를 잘 구분하는 것이 좋습니다.",
                "빠른 상황 판단과 신속한 행동이 필요한 시기입니다. 특히 재물 관련한 일들은 속전속결 하세요.",
                " 매사에 원칙을 지키고 순리를 따르세요. 법이나 규정에 어긋난 일들은 삼가는 것이 좋습니다.",
                "주위 사람이 행운을 가져오는 시기입니다. 모임이나 약속이 있다면 빠지지 말고 나가보세요.",
                " 자신의 실력이나 재능을 너무 과신하지 마세요. 자칫 평소에 하지 않던 실수를 할 수 있어요."
        };
        Random random66 = new Random();
        int index66= random.nextInt(HorseFortune_June.length);
        String selectedFortune66 = HorseFortune_June[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_June = {
                "주변 인맥 관리와 대인관계 개선에 힘써야 하는 시기입니다. 뜻밖의 귀인이나 좋은 인연을 만날 수 있어요.",
                "자신의 능력에 벗어난 일은 벌이지 마세요. 특히 많은 돈이 들어가는 일은 삼가는 것이 좋습니다.",
                "자존심보다는 실속을 우선해야 하는 시기입니다. 불필요한 경쟁이나 싸움은 피하도록 하세요.",
                "다른 사람의 일이나 책임을 대신 떠안지 마세요. 실컷 고생하고 남 좋은 일만 할 수도 있어요.",
                "욕심부리지 말고 마음을 비워야 하는 시기입니다. 한번에 너무 많은 것을 얻으려 하지 마세요."
        };
        Random random67 = new Random();
        int index67= random.nextInt(SheepFortune_June.length);
        String selectedFortune67 = SheepFortune_June[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_June = {
                "주변 분위기와 상황에 순응해야 하는 시기입니다. 새로운 변화에 맞서거나 거스르려고 하지 마세요.",
                "해야 할 일이 있으면 미루지 말고 처리하세요. 자꾸 미루다 보면 뒷감당을 못할 수도 있어요.",
                "철저한 자기 관리와 책임감이 필요한 시기입니다. 한번 맡은 일은 끝까지 책임지도록 하세요.",
                "쉽고 편한 길보다 어렵더라도 바른 길을 가세요. 요령이나 편법을 쓰면 탈이 날 수도 있어요.",
                "자신의 지위와 본분에 충실해야 할 때입니다. 나서야 할 때와 물러나야 할 때를 잘 구분하세요."
        };
        Random random68 = new Random();
        int index68= random.nextInt(MonkeyFortune_June.length);
        String selectedFortune68 = MonkeyFortune_June[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_June = {
                "자신의 마음과 감정을 잘 다스려야 하는 시기입니다. 특히 감정적인 말이나 행동은 삼가도록 하세요.",
                "한 눈 팔지 말고 현재 자신의 일에만 집중하세요. 새로운 일이나 변화는 피하는 것이 좋습니다.",
                "매사에 이해득실을 잘 따져봐야 하는 시기입니다. 자신에게 이득이 없는 일에 나서지 마세요.",
                "혼자서 모든 일을 해결하려고 하지 마세요. 어려운 일은 주위의 도움을 구하는 것이 좋습니다.",
                "있는 듯 없는 듯 조용히 지내야 하는 시기입니다. 괜히 앞에 나서거나 잘난 척을 하지 마세요."
        };
        Random random69 = new Random();
        int index69= random.nextInt(ChickenFortune_June.length);
        String selectedFortune69 = ChickenFortune_June[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_June = {
                "현재 가진 것에 적당히 만족해야 하는 시기입니다. 특히 남이 가진 것을 탐하거나 부러워하지 마세요.",
                "일이나 사업도 좋지만 너무 무리하지 마세요. 건강이나 체력 관리에도 신경 쓰는 것이 좋습니다.",
                "경쟁보다 대화와 타협을 우선해야 하는 시기입니다. 웬만한 일은 적당히 양보하고 물러나세요.",
                "다른 사람의 시기나 모함에 주의하세요. 시비나 구설을 부를 만한 일은 삼가는 것이 좋습니다.",
                "모임이나 약속을 잡기에 좋은 시기입니다. 짝이 없는 분들은 좋은 인연을 만날 수도 있어요."
        };
        Random random70 = new Random();
        int index70= random.nextInt(DogFortune_June.length);
        String selectedFortune70 = DogFortune_June[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_June = {
                "작은 일에 일희일비하지 말고 차분하게 대처하세요. 하고 싶은 말이 있어도 조금 참는 것이 좋습니다.",
                "적당한 기분 전환과 스트레스 해소가 필요한 때입니다. 잠시 숨을 돌리며 한 박자 쉬어가세요.",
                "다른 사람의 말이나 시선에 너무 신경 쓰지 마세요. 묵묵히 자신의 길을 가는 것이 좋습니다.",
                "주위에 자신의 이름을 널리 알릴 수 있는 시기입니다. 매사에 모범을 보이고 솔선수범하세요.",
                " 너무 자신의 생각이나 주장만 고집하지 마세요. 손윗사람의 뜻을 잘 따르는 것이 좋습니다."
        };
        Random random71 = new Random();
        int index71= random.nextInt(PigFortune_June.length);
        String selectedFortune71 = PigFortune_June[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        // ----------------------------------------------------------\\

        String[] MouseFortune_July = {
                "주위의 달콤한 말이나 유혹에 주의해야 하는 시기입니다. 다른 사람의 말이나 약속을 함부로 믿지 마세요.",
                "너무 큰 것만 바라지 말고 작은 것부터 잘 챙기세요. 잘하면 티끌 모아 태산을 이룰 수 있어요.",
                "노력하면 노력한 만큼 얻을 수 있는 시기입니다. 시간을 낭비하지 말고 부지런히 움직이세요." ,
                "자신의 몫은 자신이 알아서 챙기세요. 자칫 자신의 공이나 노력을 남에게 빼앗길 수 있어요.",
                "얻으려고 하기보다 지켜야 하는 시기입니다. 특히 성공이 불확실한 일에 뛰어들지 마세요."
        };
        Random random72 = new Random();
        int index72 = random.nextInt(MouseFortune_July.length);
        String selectedFortune72 = MouseFortune_July[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_July = {
                "주위 사람들과의 대화와 소통이 필요한 시기입니다. 너무 자신의 생각이나 주장만 내세우지 마세요.",
                "자신에게 이득이 없는 일에는 나서지 마세요. 매사에 이해득실을 잘 따져보는 것이 좋습니다.",
                "꾸준히 앞만 보고 나아가야 하는 시기입니다. 한 눈 팔지 말고 현재 자신의 일에 집중하세요.",
                "다른 사람의 일이나 책임을 대신 떠안지 마세요. 실컷 고생하고 남 좋은 일만 할 수 있어요.",
                "자존심보다 실리를 우선해야 하는 시기입니다. 불필요한 경쟁이나 싸움은 피하도록 하세요."
        };
        Random random73 = new Random();
        int index73 = random.nextInt(CowFortune_July.length);
        String selectedFortune73 = CowFortune_July[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_July = {
                "다른 사람의 말이나 시선에 신경 쓰지 마세요. 남들이 뭐라고 해도 자신의 길을 가는 것이 좋습니다.",
                "선택과 집중을 확실히 해야 하는 시기입니다. 일의 경중과 우선 순위를 잘 따져서 움직이세요.",
                "남의 일에 참견하거나 간섭하지 마세요. 자신의 일이 아니면 그냥 모른 척하는 것이 좋습니다.",
                "불필요한 말이나 행동은 삼가야 하는 시기입니다. 하고 싶은 말이 있어도 조금 참도록 하세요."
        };
        Random random74 = new Random();
        int index74 = random.nextInt(TigerFortune_July.length);
        String selectedFortune74 = TigerFortune_July[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_July = {
                "아무리 급해도 서두르거나 조급해 하지 마세요. 매사에 여유를 갖고 느긋하게 대처하는 것이 좋습니다.",
                "적당한 기분 전환과 스트레스 해소가 필요한 때입니다. 잠시 숨을 고르며 한 박자 쉬어 가세요.",
                "매매나 계약 관련한 일은 서두르지 마세요. 돈이 오가는 일은 천천히 결정하는 것이 좋습니다.",
                "겸손하고 예의 바른 모습이 필요한 시기입니다. 언제 어디서든 예의와 매너를 잃지 마세요.",
                "말 한 마디, 행동 하나에도 신중하세요. 오해를 부를 만한 언행은 삼가는 것이 좋습니다."
        };
        Random random75 = new Random();
        int index75 = random.nextInt(RabbitFortune_July.length);
        String selectedFortune75 = RabbitFortune_July[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_July = {
                "원대한 꿈과 포부를 가져야 하는 시기입니다. 작은 성과에 만족하지 말고 더 큰 목표를 향해 나아가세요.",
                "다른 사람의 시기나 모함에 주의하세요. 시비나 구설을 부를 만한 일은 삼가는 것이 좋습니다.",
                "골치 아픈 일이나 문제가 해결되는 시기입니다. 무슨 일이든 피하지 말고 정면으로 부딪히세요.",
                "주위 사람들이나 작은 일상에 관심을 가져 보세요. 작은 정성과 배려가 행운을 불러올 거에요."
        };
        Random random76 = new Random();
        int index76 = random.nextInt(DragonFortune_July.length);
        String selectedFortune76 = DragonFortune_July[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_July = {
                "아무리 자신 있는 일이라도 방심하지 마세요. 작고 사소한 일이라도 최선을 다하는 것이 좋습니다.",
                "매사에 철저한 준비와 계획이 필요한 시기입니다. 예정에 없던 일이나 약속도 피하도록 하세요.",
                "잘 모르는 일이나 자신 없는 분야에 뛰어들지 마세요. 모험이나 투기는 피하는 것이 좋습니다.",
                "길운이 함께 하니 만사가 순조로운 시기입니다. 재물과 명예를 한 손에 거머쥘 수도 있어요.",
                "말이 많거나 큰 소리치는 사람은 멀리 하세요. 사람을 잘 가려서 만나는 것이 좋습니다."
        };
        Random random77 = new Random();
        int index77= random.nextInt(SnakeFortune_July.length);
        String selectedFortune77 = SnakeFortune_July[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_July = {
                "매사에 공과 사를 잘 구분해야 하는 시기입니다. 아무리 가까운 사이라도 맺고 끊는 것을 확실히 하세요.",
                "주변 인맥 관리와 대인관계 개선에 힘쓰세요. 연락이 뜸한 친구에게 연락해 보는 것도 좋습니다.",
                "기대하지 않은 돈이나 재물이 들어오는 시기입니다. 얻는 것이 있으면 그만큼 베풀도록 하세요.",
                "다른 사람을 무시하거나 얕보지 마세요. 자신보다 못한 사람이라도 존중해주는 것이 좋습니다.",
                " 주위의 충고나 조언을 잘 따라야 하는 시기입니다. 귀에 거슬리는 말도 새겨 듣도록 하세요."
        };
        Random random78 = new Random();
        int index78= random.nextInt(HorseFortune_July.length);
        String selectedFortune78 = HorseFortune_July[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_July = {
                "앉아서 기다리지 말고 먼저 나서서 움직이세요. 적극적이고 진취적인 모습을 보이는 것이 좋습니다.",
                "새로운 지위나 명예를 얻을 수 있는 때입니다. 그동안 쌓은 경험이나 연륜을 잘 활용해 보세요.",
                "안 되는 일에 매달리거나 미련을 갖지 마세요. 포기해야 할 것은 빨리 포기하는 것이 좋습니다.",
                " 장기적인 안목과 넓은 시야가 필요한 시기입니다. 눈 앞의 이득보다는 먼 미래를 내다 보세요.",
                "고정 관념이나 선입견은 버리도록 하세요. 마음을 열고 새로운 것을 받아들이는 것이 좋습니다."
        };
        Random random79 = new Random();
        int index79= random.nextInt(SheepFortune_July.length);
        String selectedFortune79 = SheepFortune_July[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_July = {
                "주변 분위기와 상황에 순응해야 하는 시기입니다. 새로운 변화에 맞서거나 거스르려고 하지 마세요,",
                "혼자서 모든 것을 해결하려고 하지 마세요. 어려운 일은 주위의 도움을 구하는 것이 좋습니다.",
                "공정하고 투명한 일 처리가 필요한 시기입니다. 법이나 규정에 어긋난 일은 삼가도록 하세요.",
                "고지가 눈 앞에 있으니 조금만 힘을 내세요. 오랜 시간 바라던 목표나 소원을 이룰 수 있어요.",
                "백 마디 말보다 한 가지 행동이 필요한 시기입니다. 말로만 떠들지 말고 행동으로 보여주세요."
        };
        Random random80 = new Random();
        int index80= random.nextInt(MonkeyFortune_July.length);
        String selectedFortune80 = MonkeyFortune_July[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_July = {
                "개인보다는 조직이나 단체를 먼저 생각하세요. 때로는 대를 위해서 소를 희생해야 할 수도 있어요.",
                "기대 이상의 좋은 성과를 거둘 수 있는 때입니다. 자신의 실력과 재능을 마음껏 발휘해 보세요.",
                "다른 사람에게 너무 기대거나 의지하지 마세요. 자신의 일은 자신이 해결하는 것이 좋습니다.",
                "2보 전진을 위해 1보 후퇴가 필요한 시기입니다. 일이나 사업보다 휴식과 재충전에 힘쓰세요.",
                "자신의 실력이나 재능을 너무 과신하지 마세요. 새로운 것을 배우고 익히는 것이 좋습니다."
        };
        Random random81 = new Random();
        int index81 = random.nextInt(ChickenFortune_July.length);
        String selectedFortune81 = ChickenFortune_July[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_July = {
                "매사에 철저한 확인과 점검이 필요한 때입니다. 다 끝났다고 방심하지 말고 마무리를 철저히 하세요.",
                "바깥 활동보다 먼저 내부 단속부터 하세요. 특히 자녀나 아랫사람들을 잘 챙기는 것이 좋습니다.",
                "매사에 원칙을 지키고 순리를 따라야 하는 시기입니다. 무리한 일이나 계획은 피하도록 하세요.",
                " 경쟁보다는 대화와 타협을 우선하세요. 필요하다면 다른 경쟁자와 힘을 합치는 것도 좋습니다.",
                "변화가 많은 때이니 매사에 신중해야 하는 시기입니다. 즉흥적인 결정이나 행동은 삼가세요."
        };
        Random random82 = new Random();
        int index82= random.nextInt(DogFortune_July.length);
        String selectedFortune82 = DogFortune_July[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_July = {
                "매사에 철저한 확인과 점검이 필요한 때입니다. 다 끝났다고 방심하지 말고 마무리를 철저히 하세요.",
                "바깥 활동보다 먼저 내부 단속부터 하세요. 특히 자녀나 아랫사람들을 잘 챙기는 것이 좋습니다.",
                "매사에 원칙을 지키고 순리를 따라야 하는 시기입니다. 무리한 일이나 계획은 피하도록 하세요.",
                "경쟁보다는 대화와 타협을 우선하세요. 필요하다면 다른 경쟁자와 힘을 합치는 것도 좋습니다.",
                "변화가 많은 때이니 매사에 신중해야 하는 시기입니다. 즉흥적인 결정이나 행동은 삼가세요."
        };
        Random random83 = new Random();
        int index83 = random.nextInt(PigFortune_July.length);
        String selectedFortune83 = PigFortune_July[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        // -----------------------------------------------------------\\

        String[] MouseFortune_August = {
                "긍정적이고 낙관적인 태도가 필요한 시기입니다. 작은 일에 일희일비하지 말고 차분하게 대처하세요.",
                "손윗사람으로서 명예와 체통을 지키세요. 매사에 모범을 보이고 솔선수범 하는 것이 좋습니다.",
                "티끌 모아 태산을 이룰 수 있는 때입니다. 너무 큰 것만 바라지 말고 작은 것부터 잘 챙기세요.  " ,
                "말이 많거나 큰 소리치는 사람은 조금 멀리 하세요. 사람을 잘 가려서 만나는 것이 좋습니다.",
                " 감정적인 말이나 행동은 삼가야 하는 시기입니다. 작은 일에 흥분을 하거나 짜증내지 마세요."
        };
        Random random84 = new Random();
        int index84 = random.nextInt(MouseFortune_August.length);
        String selectedFortune84 = MouseFortune_August[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_August = {
                "아무리 급해도 서두르거나 조급해하지 마세요. 매사에 여유를 갖고 느긋하게 대처하는 것이 좋습니다..",
                "맺고 끊는 것을 확실히 해야 하는 시기입니다. 특히 공적인 일과 사적인 감정을 잘 구분하세요.",
                "다른 사람을 무시하거나 얕보지 마세요. 자신보다 못한 사람이라도 존중해주는 것이 좋습니다.",
                "새로운 각오와 마음가짐이 필요한 때입니다. 현실에 안주하지 말고 새로운 도전에 나서보세요.",
                "개인보다는 조직이나 단체를 먼저 생각하세요. 대를 위해서는 소를 희생해야 할 수도 있어요."
        };
        Random random85 = new Random();
        int index85 = random.nextInt(CowFortune_August.length);
        String selectedFortune85 = CowFortune_August[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_August = {
                "자신의 지위와 본분에 충실해야 하는 시기입니다. 나서야 할 때와 물러나야 할 때를 잘 구분하세요.",
                "바깥 활동보다 먼저 내부 단속부터 하세요. 특히 자녀나 아랫사람들을 잘 챙기는 것이 좋습니다.",
                " 2보 전진을 위해 1보 후퇴가 필요한 시기입니다. 일이나 사업보다 휴식과 재충전에 힘쓰세요.",
                "지난 일이나 과거에 미련을 갖지 마세요. 과거보다는 현재와 미래를 중시하는 것이 좋습니다."
        };
        Random random86 = new Random();
        int index86 = random.nextInt(TigerFortune_August.length);
        String selectedFortune86 = TigerFortune_August[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_August = {
                "해야 할 일이 있다면 미루지 말고 처리하세요. 특히 재물 관련한 일은 속전속결하는 것이 좋습니다.",
                "새로운 지위나 명예를 얻을 수 있는 시기입니다. 그동안 쌓은 경험이나 연륜을 잘 살려 보세요.",
                "아무리 자신 있는 일이라도 방심하지 마세요. 작고 사소한 일도 최선을 다하는 것이 좋습니다.",
                "빠른 상황 판단과 신속한 행동이 필요한 때입니다. 좋은 기회가 찾아온다면 주저하지 마세요.",
                "무리한 일이나 계획은 피하도록 하세요. 너무 욕심을 부리면 득보다 실이 많을 수 있어요."
        };
        Random random87 = new Random();
        int index87 = random.nextInt(RabbitFortune_August.length);
        String selectedFortune87 = RabbitFortune_August[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_August = {
                "잘 모르는 일이나 자신 없는 분야에 뛰어들지 마세요. 요행이나 횡재를 바라다가 손해를 볼 수 있어요.",
                "골치 아픈 일이나 문제가 해결되는 시기입니다. 그동안의 노력이 하나 둘 결실을 맺을 거에요.",
                "일의 경중과 우선 순위를 잘 따져서 움직이세요. 선택과 집중을 확실히 하는 것이 좋습니다.",
                "주위의 시기나 모함에 주의해야 하는 시기입니다. 남에게 흠 잡힐 만한 일은 삼가도록 하세요."
        };
        Random random88 = new Random();
        int index88 = random.nextInt(DragonFortune_August.length);
        String selectedFortune88 = DragonFortune_August[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_August = {
                "고지가 눈 앞에 있으니 조금만 더 힘을 내세요. 오랜 시간 바라던 목표나 소원을 이룰 수도 있어요.",
                "주위 사람들이 행운을 가져다 주는 시기입니다. 모임이나 약속이 있다면 빠지지 말고 나가보세요.",
                "한번 맡은 일은 끝까지 책임지도록 하세요. 성실하고 책임감 있는 모습을 보이는 것이 좋습니다.",
                "백 마디 말보다 한 가지 행동이 필요한 시기입니다. 말로만 떠들지 말고 행동으로 보여주세요.",
                "남이 가진 것을 탐하거나 부러워하지 마세요. 현재 가진 것에 적당히 만족하는 것이 좋습니다."
        };
        Random random89 = new Random();
        int index89= random.nextInt(SnakeFortune_August.length);
        String selectedFortune89 = SnakeFortune_August[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_August = {
                "매사에 원칙을 지키고 순리를 따르도록 하세요. 법이나 규정에 어긋난 일들은 삼가는 것이 좋습니다.",
                "주변 분위기와 상황에 순응해야 하는 시기입니다. 거창한 계획보다 실행 가능한 목표를 세우세요.",
                "너무 의욕만 내세우거나 남보다 앞서가지 마세요. 적당히 주위와 보조를 맞추는 것이 좋습니다.",
                "매사에 이해득실을 잘 따져봐야 하는 시기입니다. 자신에게 이득이 없는 일에 나서지 마세요.",
                "다른 사람의 일이나 책임을 대신 떠안지 마세요. 실컷 고생하고 남 좋은 일만 할 수도 있어요."
        };
        Random random90 = new Random();
        int index90= random.nextInt(HorseFortune_August.length);
        String selectedFortune90 = HorseFortune_August[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_August = {
                "주위에 자신의 이름을 널리 알릴 수 있는 시기입니다. 자신의 실력과 재능을 마음껏 발휘해 보세요.",
                "너무 안일한 태도나 지나친 낙관은 피하세요. 예상치 못한 암초나 장애물이 나타날 수 있어요.",
                "역지사지의 자세가 필요한 시기입니다. 자신의 입장보다는 상대방의 입장에서 생각해 보세요.",
                "주위의 달콤한 말이나 유혹에 주의하세요. 매사에 자신의 주관을 확실히 하는 것이 좋습니다.",
                "모임이나 약속을 잡기에 좋은 시기입니다. 다만 짝이 있는 분들은 삼각 관계에 주의하세요."
        };
        Random random91 = new Random();
        int index91 = random.nextInt(SheepFortune_August.length);
        String selectedFortune91 = SheepFortune_August[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_August = {
                "길운이 함께 하니 매사에 자신감을 가지세요. 잘하면 명예와 재물을 한 손에 거머쥘 수도 있어요.",
                "적당한 휴식과 스트레스 해소가 필요한 때입니다. 일이나 사업도 좋지만 너무 무리하지 마세요.",
                "받으려고 하기보다 먼저 베풀도록 하세요. 돈이나 재물보다는 사람을 우선하는 것이 좋습니다.",
                "자신의 실력과 경쟁력을 키워야 하는 시기입니다. 새로운 것을 배우거나 익혀 보도록 하세요.",
                "새로운 소식이나 정보에 귀를 기울이세요. 다른 사람들보다 한 발 앞서 나가는 것이 좋습니다."
        };
        Random random92 = new Random();
        int index92 = random.nextInt(MonkeyFortune_August.length);
        String selectedFortune92 = MonkeyFortune_August[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_August = {
                "앉아서 기다리지 말고 먼저 나서서 움직이세요. 적극적이고 진취적인 모습을 보이는 것이 좋습니다.",
                "기대하지 않은 행운이 찾아오는 때입니다. 반가운 소식이나 기다리던 사람이 찾아올 수 있어요.",
                "고정 관념이나 선입견은 버리도록 하세요. 마음을 열고 새로운 것을 받아들이는 것이 좋습니다.",
                "93년생 - 적당한 순발력과 임기응변이 필요한 때입니다. 너무 원칙만 따지지 말고 융통성을 발휘하세요.",
                "혼자서 모든 것을 해결하려고 하지 마세요. 어려운 일은 주위의 도움을 구하는 것이 좋습니다."
        };
        Random random93 = new Random();
        int index93 = random.nextInt(ChickenFortune_August.length);
        String selectedFortune93 = ChickenFortune_August[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_August = {
                "공정하고 투명한 일 처리가 필요한 시기입니다. 요령이나 편법을 쓰면 나중에 탈이 날 수 있어요.",
                "다른 사람에게 너무 기대거나 의지하지 마세요. 자신의 일은 자신이 해결하는 것이 좋습니다.",
                "결과보다 과정을 중시해야 하는 시기입니다. 노력에 비해 성과가 부족해도 실망하지 마세요.",
                "다른 일에 한 눈 팔거나 시간을 낭비하지 마세요. 묵묵히 앞만 보고 나아가는 것이 좋습니다.",
                "겸손하고 예의 바른 모습이 필요한 때입니다. 아무리 가까운 사이라도 예의를 잘 지키세요."
        };
        Random random94 = new Random();
        int index94 = random.nextInt(DogFortune_August.length);
        String selectedFortune94 = DogFortune_August[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_August = {
                "주변 인맥 관리와 대인관계 개선에 힘써야 하는 시기입니다. 뜻밖의 귀인이나 좋은 인연을 만날 수 있어요.",
                "자존심을 앞세우기보다는 실속을 중시하세요. 불필요한 경쟁이나 싸움은 피하는 것이 좋습니다.",
                "장기적인 안목과 넓은 시야가 필요한 시기입니다. 눈 앞의 이익보다는 먼 미래를 내다보세요.",
                "남의 일에 참견하거나 간섭하지 마세요. 자신의 일이 아니면 그냥 모른 척하는 것이 좋습니다.",
                "꺼진 불도 다시 봐야 하는 시기입니다. 다 끝났다고 방심하지 말고 마무리를 철저히 하세요."
        };
        Random random95 = new Random();
        int index95 = random.nextInt(PigFortune_August.length);
        String selectedFortune95 = PigFortune_August[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        // ------------------------------------------------------------\\

        String[] MouseFortune_September = {
                "너무 자신의 생각이나 주장만 고집하지 마세요. 주위의 충고나 조언을 잘 새겨 듣는 것이 좋습니다.",
                "욕심부리지 말고 마음을 비워야 하는 시기입니다. 특히 무리한 일이나 계획은 피하도록 하세요.",
                "하고 싶은 말이 있어도 조금 참도록 하세요. 불평 불만이 있어도 속으로 삭이는 것이 좋습니다.",
                "역지사지의 자세가 필요한 시기입니다. 자신의 입장보다는 상대방의 입장에서 생각해 보세요.",
                "눈 앞의 이익보다 먼 미래를 내다보세요. 장기적인 안목과 넓은 시야를 갖추는 것이 좋습니다."
        };
        Random random96 = new Random();
        int index96 = random.nextInt(MouseFortune_September.length);
        String selectedFortune96 = MouseFortune_September[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_September = {
                "물고기가 물을 만났으니 만사가 순조로운 시기입니다. 자신의 실력과 재능을 마음껏 발휘해 보세요.",
                "서두르지 말고 매사에 여유를 갖도록 하세요. 여유롭고 느긋한 태도가 행운을 가져올 거에요.",
                "백 마디 말보다 한 가지 행동이 필요한 시기입니다. 말로만 떠들지 말고 행동으로 보여주세요.",
                "고지가 눈 앞에 있으니 조금만 더 힘을 내세요. 지금 포기하면 다 잡은 토끼를 놓칠 수 있어요.",
                "자신의 지위와 본분에 충실해야 하는 시기입니다. 특히 책임질 수 없는 일은 벌이지 마세요."
        };
        Random random97 = new Random();
        int index97 = random.nextInt(CowFortune_September.length);
        String selectedFortune97 = CowFortune_September[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_September = {
                "남이 가진 것을 탐하거나 부러워하지 마세요. 현재 자신이 가진 것에 적당히 만족하는 것이 좋습니다.",
                "눈과 귀는 열고 입은 무겁게 해야 하는 시기입니다. 불필요한 말이나 행동은 삼가도록 하세요.",
                "다른 사람의 일이나 책임을 대신 떠안지 마세요. 실컷 고생하고 남 좋은 일만 할 수도 있어요.",
                "새로운 시도와 변화가 필요한 시기입니다. 현실에 안주하지 말고 새로운 도전에 나서 보세요.",
                "받으려고 하기보다 먼저 베풀도록 하세요. 돈이나 재물보다는 사람을 우선하는 것이 좋습니다."
        };
        Random random98 = new Random();
        int index98 = random.nextInt(TigerFortune_September.length);
        String selectedFortune98 = TigerFortune_September[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_September = {
                "공정하고 투명한 일 처리가 필요한 시기입니다. 특히 공적인 일에 사적인 감정을 내세우지 마세요.",
                "손윗사람으로서 명예와 체통을 지키세요. 시비나 구설을 부를 만한 일은 피하는 것이 좋습니다.",
                "적극적이고 진취적인 모습이 필요한 때입니다. 앉아서 기다리지 말고 먼저 나서서 움직이세요.",
                "지난 일이나 과거에 너무 연연하지 마세요. 과거보다 현재와 미래를 중시하는 것이 좋습니다.",
                "이동운과 애정운이 아주 좋은 시기입니다. 뜻밖의 귀인이나 좋은 인연을 만날 수도 있어요."
        };
        Random random99 = new Random();
        int index99 = random.nextInt(RabbitFortune_September.length);
        String selectedFortune99 = RabbitFortune_September[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_September = {
                "원대한 꿈과 포부를 가져야 하는 시기입니다. 작은 성과에 만족하지 말고 더 큰 목표를 향해 나아가세요.",
                "얻고자 하는 것이 있다면 그만한 노력을 하세요. 운보다 자신의 땀과 노력을 믿는 것이 좋습니다.",
                "막혀 있던 일이 시원하게 풀리는 시기입니다. 오랜 시간 바라던 목표나 소원을 이룰 수 있어요.",
                "혼자서 모든 것을 해결하려고 하지 마세요. 어려운 일은 주위의 도움을 구하는 것이 좋습니다.",
                "겸손하고 예의 바른 모습이 필요한 시기입니다. 언제 어디서든 예의와 매너를 잃지 마세요."
        };
        Random random100 = new Random();
        int index100 = random.nextInt(DragonFortune_September.length);
        String selectedFortune100 = DragonFortune_September[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_September = {
                "다른 사람의 말에 이리 저리 흔들리지 마세요. 매사에 자신의 주관을 확실히 하는 것이 좋습니다.",
                "사람을 잘 가려서 만나야 하는 시기입니다. 말이 많거나 큰 소리치는 사람은 조금 멀리 하세요.",
                "안되는 일에 매달리거나 미련을 갖지 마세요. 포기해야 할 것은 빨리 포기하는 것이 좋습니다.",
                "적당한 순발력과 임기응변이 필요한 시기입니다. 주변 분위기에 맞춰서 유연하게 처신하세요.",
                "주위의 달콤한 말이나 유혹에 주의하세요. 다른 사람의 말을 믿었다가 손해를 볼 수 있어요."
        };
        Random random101 = new Random();
        int index101 = random.nextInt(SnakeFortune_September.length);
        String selectedFortune101 = SnakeFortune_September[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_September = {
                "다른 사람의 일에 참견하거나 간섭하지 마세요. 자신의 일이 아니면 그냥 모른 척하는 것이 좋습니다.",
                "다른 사람과의 금전 거래는 삼가야 하는 시기입니다. 아무리 가까운 사이라도 보증은 피하세요.",
                "너무 의욕만 내세우거나 남보다 앞서가지 마세요. 적당히 주위와 보조를 맞추는 것이 좋습니다.",
                "선택과 집중을 확실히 해야 하는 시기입니다. 일의 경중과 우선 순위를 잘 따져서 움직이세요.",
                "다른 사람에게 너무 기대거나 의지하지 마세요. 자신의 일은 자신이 해결하는 것이 좋습니다."
        };
        Random random102 = new Random();
        int index102 = random.nextInt(HorseFortune_September.length);
        String selectedFortune102 = HorseFortune_September[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_September = {
                "티끌 모아 태산을 이룰 수 있는 시기입니다. 너무 큰 것만 바라지 말고 작은 성과라도 꾸준히 쌓아가세요.",
                "다른 사람을 무시하거나 얕잡아 보지 마세요. 자신보다 못한 사람도 존중해 주는 것이 좋습니다.",
                "주위에 자신의 이름을 널리 알릴 수 있는 시기입니다. 매사에 모범을 보이고 솔선수범하세요.",
                "감정적인 말이나 행동은 삼가도록 하세요. 기분 상하는 일이 있어도 조금 참는 것이 좋습니다.",
                "결과보다 과정을 중시해야 하는 시기입니다. 쉽고 편한 길보다 어렵더라도 바른 길을 가세요."
        };
        Random random103 = new Random();
        int index103 = random.nextInt(SheepFortune_September.length);
        String selectedFortune103 = SheepFortune_September[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_September = {
                "길운이 함께 하니 매사에 자신감을 가지세요. 잘하면 명예와 재물을 한 손에 거머쥘 수도 있어요.",
                "새로운 지위나 명예를 얻을 수 있는 시기입니다. 그동안 쌓은 경험과 연륜을 잘 발휘해 보세요.",
                "불필요한 경쟁이나 싸움은 피하세요. 자존심을 앞세우기보다 실속을 중시하는 것이 좋습니다.",
                "기대 이상의 재물을 얻을 수 있는 시기입니다. 다만 얻는 것이 있으면 그만큼 베풀도록 하세요.",
                "언제 어디서든 여유와 미소를 잃지 마세요. 긍정적이고 낙관적인 모습을 보이는 것이 좋습니다."
        };
        Random random104 = new Random();
        int index104 = random.nextInt(MonkeyFortune_September.length);
        String selectedFortune104 = MonkeyFortune_September[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_September = {
                "새로운 변화에 맞서거나 거스르려고 하지 마세요. 주변 분위기와 상황에 순응하는 것이 좋습니다.",
                "적당한 휴식과 기분 전환이 필요한 시기입니다. 일이나 사업도 좋지만 너무 무리하지 마세요.",
                "잘 모르는 일이나 자신 없는 분야에 뛰어들지 마세요. 모험이나 투기는 피하는 것이 좋습니다.",
                "새로운 일이나 변화는 피해야 하는 시기입니다. 움직이면 불리하니 조용히 때를 기다리세요.",
                "경쟁보다 대화와 타협을 우선하세요. 필요하다면 다른 경쟁자와 힘을 합치는 것도 좋습니다."
        };
        Random random105 = new Random();
        int index105 = random.nextInt(ChickenFortune_September.length);
        String selectedFortune105 = ChickenFortune_September[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_September = {
                "다른 곳에 한 눈 팔지 말고 현재 자신의 일에 집중하세요. 묵묵히 앞만 보고 나아가는 것이 좋습니다.",
                "주위의 시기나 모함에 주의해야 하는 시기입니다. 남에게 흠 잡힐 만한 일은 삼가도록 하세요.",
                "자신에게 이득이 없는 일에는 나서지 마세요. 매사에 이해득실을 잘 따져보는 것이 좋습니다.",
                "노력하면 노력한 만큼 얻을 수 있는 시기입니다. 시간을 낭비하지 말고 부지런히 움직이세요.",
                "일시적인 어려움에 포기하거나 굴복하지 마세요. 인내와 끈기가 빛나는 성공을 불러올 거에요."
        };
        Random random106 = new Random();
        int index106 = random.nextInt(DogFortune_September.length);
        String selectedFortune106 = DogFortune_September[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_September = {
                "다른 사람들에게 약한 모습을 보이지 마세요. 스스로에 대한 믿음과 자부심을 갖는 것이 좋습니다.",
                "있는 듯 없는 듯 조용히 지내야 하는 시기입니다. 괜히 앞에 나서거나 아는 척을 하지 마세요.",
                "주위 사람들이나 작은 일상에 관심을 가져보세요. 작은 정성과 배려가 행운을 가져올 거에요.",
                "매사에 원칙을 지키고 순리를 따라야 할 때입니다. 요령이나 편법을 쓰면 탈이 날 수 있어요.",
                "즉흥적인 결정이나 행동은 삼가세요. 예정에 없던 일이나 약속도 피하는 것이 좋습니다."
        };
        Random random107 = new Random();
        int index107= random.nextInt(PigFortune_September.length);
        String selectedFortune107 = PigFortune_September[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        // -------------------------------------------------------\\

        String[] MouseFortune_October = {
                "발전 할 수 있는 가능성이 높으니 목적의식을 가지고 노력해야 할 때이다.",
                "주변의 도움이 필요하다. 적극적으로 찾아보아라.",
                "겸손하지 않으면 지금의 평탄함을 유지 할 수 없음을 명심하라.",
                "동남쪽이 길한 방향이다. 재물은 크게 들어오지 못한다.",
                "고집을 버리고 더 나은 방식으로 고쳐보아라."
        };
        Random random108 = new Random();
        int index108 = random.nextInt(MouseFortune_October.length);
        String selectedFortune108 = MouseFortune_October[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_October = {
                "매사 겸허하게 마음을 비우고 행동하는 것이 좋다.",
                "윗사람이라고 할지라도 아랫사람에게 봉사하는 것이 필요한 시기이다.",
                "얼핏 손해 같지만 반드시 좋은 운이 되어 돌아올 것이다.",
                "목적을 갖고 도움을 주지 마라.",
                "욕심과 초조함이 더해져서 실패 우려가 있다."
        };
        Random random109 = new Random();
        int index109 = random.nextInt(CowFortune_October.length);
        String selectedFortune109 = CowFortune_October[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_October = {
                "어려움이 많고 괴로움이 많을 것이다.",
                "능력만 믿고 밀어붙이면 화를 입기 쉬우니 주의해라.",
                "조용히 움직이지 말고 때를 기다리는 것이 길하다.",
                "고생이 그리 오래 지속될 리는 없으니 견디어 내는 인내를 가지도록 하라.",
                "행복을 시기 질투하는 자가 있다. 주의하라."
        };
        Random random110 = new Random();
        int index110 = random.nextInt(TigerFortune_October.length);
        String selectedFortune110 = TigerFortune_October[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_October = {
                "어려움을 각오하고 나아간다면 좋은 결과가 있을 것이다.",
                "미리 겁먹고 체념하지 말고 참고 견디며 나아갈 때이다.",
                "겸허한 마음과 근면한 마음으로 다툼을 주의한다면 좋은 결과가 찾아온다.",
                "어렵겠지만 다른 사람의 부탁을 거절하라.",
                "동료와의 기쁜 만남이 있다 즐겨라."

        };
        Random random111 = new Random();
        int index111 = random.nextInt(RabbitFortune_October.length);
        String selectedFortune111 = RabbitFortune_October[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_October = {
                "그 동안 평탄한 길을 왔지만 곧 시련이 찾아온다.",
                "눈앞의 욕심에 현혹되지 말고 신뢰를 중요시하라.",
                "남성이라면 이성과의 관계를 조심해야 될 필요가 있다.",
                "실수나 어긋남이 있더라도 당황하지 말고 대범해야 한다.",
                "조그마한 일에 충실해야 될 때입니다."
        };
        Random random112 = new Random();
        int index112 = random.nextInt(DragonFortune_October.length);
        String selectedFortune112 = DragonFortune_October[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_October = {
                "적당주의는 금물이다. 어떤 일도 성공하지 못하리라.",
                "앞에 나서지 말고 중도를 선택하는 것이 현명하다.",
                "타인의 잘못을 지나치게 비난하기보다는 온정을 베푸는 것이 길하다.",
                "바라는 일이 잘 되지는 않지만 꾸준하게 노력하라.",
                "지나치면 부족한 것만도 못하다는 사실을 명심하라."
        };
        Random random113 = new Random();
        int index113 = random.nextInt(SnakeFortune_October.length);
        String selectedFortune113 = SnakeFortune_October[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_October = {
                "공을 내세우지 말고 열심히 노력하면 반드시 행운이 찾아 올 것이다.",
                "남의 눈을 의식해서 노력한다면 성사 되지 않는다."
        };
        Random random114 = new Random();
        int index114 = random.nextInt(HorseFortune_October.length);
        String selectedFortune114 = HorseFortune_October[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_October = {
                "뜻대로 되는 것이 하나 없는 힘든 상황이다.",
                "때를 기다리며 힘을 길러야 한다.",
                "모든 일에는 순리가 있는 법이다.",
                " 무리가 따르더라도 원하는 것을 이룰 수 있을 것이다.",
                "만족하고 바르게 행동한다면 모든 것이 길하다.",
        };
        Random random115 = new Random();
        int index115 = random.nextInt(SheepFortune_October.length);
        String selectedFortune115 = SheepFortune_October[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_October = {
                "일에 장애가 많아 초조한 마음이 생긴다.",
                "주위 사람들과의 마음가짐이 상반되어 피할 수 없는 위기의 상황이다.",
                "다른 사람과의 시비에 드는 것을 피하라.",
                "지는 것이 이기는 것이다.",
                "아무리 옳을 지라도 나서지 말고 가만히 참아라."
        };
        Random random116 = new Random();
        int index116 = random.nextInt(MonkeyFortune_October.length);
        String selectedFortune116 = MonkeyFortune_October[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_October = {
                "자신과 상관없는 일에 참견하지 말라.",
                "오늘 하루 묵묵히 물러나 지내는 게 상책이다.",
                "새로운 일을 추진하는 것은 흉하다.",
                "흉한 인간관계가 있다면 속히 정리하는 게 길하다.",
                "운의 쇠퇴기에 있다. 모든 일을 자제하라."
        };
        Random random117 = new Random();
        int index117 = random.nextInt(ChickenFortune_October.length);
        String selectedFortune117 = ChickenFortune_October[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_October = {
                "앞길에 어려움이 생겨 뜻대로 일이 풀리지 않는다.",
                "신중하고 어려움에 대한 굳은 각오가 필요하다.",
                "개인의 사리사욕을 버리고 공동의 이익에 봉사하라.",
                "성실한 사람들과 사이좋게 지내며 마음에 악을 지워야 한다.",
                "여행은 금물. 큰 사고를 당할 수 있다. 조심하라."
        };
        Random random118 = new Random();
        int index118 = random.nextInt(DogFortune_October.length);
        String selectedFortune118 = DogFortune_October[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_October = {
                "주위에 사람들과 재물들이 모여들어 번성할 길한 운이다.",
                "길흉이 교차되는 하루로서 사람들 속에 흉함이 있다.",
                "바른 마음으로 인해 사람들이 모인다.",
                "재물운과 이성운이 좋은 시기이다.",
                "재물이 모인다고 해서 독점하는 것은 위험하다."
        };
        Random random119 = new Random();
        int index119= random.nextInt(PigFortune_October.length);
        String selectedFortune119 = PigFortune_October[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        // ------------------------------------------------------- \\

        String[] MouseFortune_November = {
                "나서면 나설수록 구설이 따를 수 있으니 침착하게 때를 기다리는 것이 더 유리하답니다.",
                "돈문제는 최대한 투명하게 해야 합니다. 트집 잡히는 일이 아예 없도록 주의하길 바라요.",
                "계획없는 소비는 삼가는게 좋습니다. 딱 한번만 더 둘러본다면 훨씬 더 저렴한게 많아요.",
                "자그마한 다툼 쯤은 괜찮습니다. 다툼으로 인해 좀더 가까워지는 계기가 될 수도 있네요.",
                "가까운 사이에도 구설수는 오갈 수 있는 달이에요. 가까운 사이일수록 신경써야 합니다."
        };
        Random random120 = new Random();
        int index120 = random.nextInt(MouseFortune_November.length);
        String selectedFortune120 = MouseFortune_November[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_November = {
                "생각보다 아랫사람들에게 좋은 아이디어를 많이 얻을 수 있는 달이에요. 귀를 열어봐요.",
                "칠전팔기의 뜻을 되새겨보길 바랍니다. 포기만 하지 않으면 완주하는데 문제 없답니다.",
                "처음부터 정답을 알려주지 말아요. 어떻게 하면 해결될 지에 대한 조언만 하는게 좋아요.",
                "머지않아 끝이 보이는군요. 지금까지 고생한 보람을 성과로 얻을 수 있는 좋은 달이네요.",
                "주변에서 들려오는 말은 신경쓰지 말아요. 무시하는게 내 정신건강에도 좋을 거랍니다."
        };
        Random random121 = new Random();
        int index121 = random.nextInt(CowFortune_November.length);
        String selectedFortune121 = CowFortune_November[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_November = {
                "어깨가 올라가면 나락하기 쉽답니다. 높은 자리에 갈수록 어깨는 내려갈 수 있도록 해요.",
                "확실한 일이 아니라면 함부로 얘기하지 않아야 돼요. 상대가 변덕이 생길지도 모릅니다.",
                "실수가 잦아지면 신뢰도 잃기 마련이죠. 다시 한 번 더 확인 해보는 것이 최선이랍니다.",
                "잘 할 수 있다는 생각이 더 좋은 결과를 불러오네요. 자신감이 더욱 필요한 달이랍니다.",
                "생각지도 못한 금전이나 귀인이 붙을 수 있는 달이니 웃음이 가득하겠군요. 즐겨보세요."
        };
        Random random122 = new Random();
        int index122 = random.nextInt(TigerFortune_November.length);
        String selectedFortune122 = TigerFortune_November[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_November = {
                "가까운 사람들에게 소홀해지기 쉬운 달입니다. 주변 사람들을 챙기는 시간이 필요해요.",
                "일이 많은건 좋지만 모두 떠맡지 않도록 주의하세요. 일보다 더 소중한 것들이 많아요.",
                "주어진 일만 신경써도 벅차니 일어나지 않은 일에 대한 걱정으로 시간을 보내지 말아요.",
                "좋은 제안이 들어와도 동업자와 함께 하는 일이라면 다시 한 번 생각하는게 좋겠습니다.",
                "나중에 후회해도 소용 없답니다. 당장 지금이 아니라 길게 보는 안목이 필요한 달이군요."
        };
        Random random123 = new Random();
        int index123 = random.nextInt(RabbitFortune_November.length);
        String selectedFortune123 = RabbitFortune_November[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_November = {
                "당장 내일의 일도 모른답니다. 오늘 하루, 이 시간을 즐기는 여유로움이 필요하겠습니다.",
                "이해득실만 따지면 신용을 잃기 딱 좋은 달이군요. 맡은 일에만 충실한 것이 더 좋아요.",
                "피한다고 해결되진 않겠군요. 어떻게든 해결해야 하니 당장 부딪히는게 정답이랍니다.",
                "충고는 주변 사람들이 없는 두 사람의 공간에서 하는 것이 훨씬 효율적일 수 있답니다.",
                "미워도 어쩔 수 없는 내 사람입니다. 미운 놈 떡 하나 더 준다 생각하는게 더 맘 편해요."
        };
        Random random124 = new Random();
        int index124 = random.nextInt(DragonFortune_November.length);
        String selectedFortune124 = DragonFortune_November[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_November = {
                "버스는 이미 지나가고 없으니 기다리지말고 여기저기 움직이는 것이 더 유리하답니다.",
                "무시하지 말고 아랫사람의 의견도 들어보세요. 좋은 아이디어가 정말 많이 쏟아지네요.",
                "미루고 미루다 보면 끝이 없겠군요. 최대한 이번 달 내로 처리한다고 생각해야 한답니다.",
                "다음 스케쥴에 차질이 생기지 않도록 체력 안배를 잘 해야 하니 컨디션 조절에 힘쓰세요.",
                "상대를 제압하기에 당당함만큼 좋은 건 없겠습니다. 모르더라도 기죽지 않길 바랍니다."
        };
        Random random125 = new Random();
        int index125 = random.nextInt(SnakeFortune_November.length);
        String selectedFortune125 = SnakeFortune_November[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_November = {
                "뜸했던 지인들에게 안부를 물어본다면 좋은 정보들과 소식으로 운을 얻을 수 있답니다.",
                "처음부터 너무 많은 정을 나누지는 말아요. 아직은 눈치를 살펴야 할 때니 한 발 숨어요.",
                "원숭이도 나무에서 떨어지는 일이 있죠. 자신 있더라도 다시 한 번 살펴보길 바랍니다.",
                "마음이 조급하면 되려 시간이 빠르게 간답니다. 하나하나씩 여유를 가지고 처리하세요.",
                "상대가 어떤 사람인지 잘 보고 덤벼야 한답니다. 상대가 먼저 약점을 보일때까지 참아요."
        };
        Random random126 = new Random();
        int index126 = random.nextInt(HorseFortune_November.length);
        String selectedFortune126 = HorseFortune_November[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_November = {
                "늘 하던 일이라 하여도 여유로운 마음을 가져야 건강도 지킬 수 있음을 명심해야 합니다.",
                "고민이 있다면 사람들과 함께 공유해보세요. 생각보다 쉬운 해결책들이 더 많이 있어요.",
                "피드백 받을 사람을 정해보세요. 약간의 조언으로 더 좋은 성과를 얻을 수 있을 거에요.",
                "기분이 좋지 않을 때 하는 약속은 더 신중하게 해야 한답니다. 괜히 귀찮은 일이 많아요.",
                "나와 맞는 사람들과 어울리고 있으니 나에 대해 궁금하다면 주변 사람들을 살펴보아요."
        };
        Random random127 = new Random();
        int index127 = random.nextInt(SheepFortune_November.length);
        String selectedFortune127 = SheepFortune_November[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_November = {
                "내가 내 입으로 말하긴 민망할테니 누군가 알아줄 때까지 조금 기다려보는 것도 좋아요.",
                "입을 무겁게 유지하는 것이 좋겠습니다. 입을 닫고 귀를 열어야 쏠쏠한 정보가 많겠어요.",
                "구구절절한 변명보다는 사실을 증명하는 한 가지만 딱 말해보세요. 더 유리할 수 있어요.",
                "손재가 있을 수 있으니 돈거래가 있다면 무조건 문서상으로 확실하게 남기는게 좋아요.",
                "다퉈봤자 나만 손해랍니다. 사소한 다툼이라면 최대한 피해다니는게 더 현명하답니다."
        };
        Random random128 = new Random();
        int index128 = random.nextInt(MonkeyFortune_November.length);
        String selectedFortune128 = MonkeyFortune_November[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_November = {
                "쉽게 얻은 만큼 쉽게 잃을 수 있는 달입니다. 처음부터 많은 정을 주지 않는게 좋습니다.",
                "귀인은 생각보다 가까운 곳에 있답니다. 주변 사람들부터 잘 살펴보면 횡재가 있답니다.",
                "저마다 상황이 다 달랐을 거랍니다. 상대를 이해해주는 것이 무엇보다 중요한 달이에요.",
                "멘토가 없다면 북멘토도 좋아요. 책을 가까이 할 수 있는 달로 보내봐도 나쁘지 않네요."
        };
        Random random129 = new Random();
        int index129= random.nextInt(ChickenFortune_November.length);
        String selectedFortune129 = ChickenFortune_November[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_November = {
                "이미 끝난 일은 질질끌지 말고 일찌감치 정리하는 것이 더 유리하게 적용하니 명심해요.",
                "빌려줬다가 영영 못받을 수 있으니 주는 것이 아니라면 지혜롭게 거절하는 것이 좋아요.",
                "내 행동으로 운을 버릴 수 있으니 내게 닥친 일들에 대해 신세한탄은 멈추는게 좋겠어요.",
                "감정변화가 클 수 있지만 내 기분에 최대한 솔직해지는 것이 유리합니다. 숨기지 말아요."
        };
        Random random130 = new Random();
        int index130= random.nextInt(DogFortune_November.length);
        String selectedFortune130 = DogFortune_November[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_November = {
                "예쁘면 예쁘다, 소중한만큼 표현하고 드러내야 한답니다. 감정을 숨기지 않는게 좋아요.",
                "어렵게나마 시간을 내서라도 주변 사람들을 만나길 바랍니다. 관계 개선에 힘써야 해요.",
                "내숭부릴 필요 없답니다. 내 모습 그대로 사랑해주는 사람이 곁에 있은 걱정하지 말아요.",
                "아무리 친구라 하더라도 공적인 일은 스스로 처리하는게 좋아요. 도움받는건 삼가세요"
        };
        Random random131 = new Random();
        int index131= random.nextInt(PigFortune_November.length);
        String selectedFortune131 = PigFortune_November[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        // --------------------------------------------------------\\

        String[] MouseFortune_December = {
                "예상되는 위험에 미리미리 대비하라.",
                "건강이 많이 악화된다. 종합 진단을 한번 받아봐라.",
                "노후를 생각해서 돈을 좀 저축하는 것이 바람직하다.",
                "너무 경솔하게 행동하지 말고 기다리는 지혜가 필요하다.",
                "윗사람에게 대들지 말고 예의를 갖추어라."
        };
        Random random132 = new Random();
        int index132 = random.nextInt(MouseFortune_December.length);
        String selectedFortune132 = MouseFortune_December[index]; //쥐띠 子 랜덤으로 운세 가져오기

        String[] CowFortune_December = {
                "자신의 취지를 점검하는 시기이다.",
                "경쟁하지 마라. 상대는 귀하보다 한 수 위.",
                "부부간의 갈등이 우려되니 한 발 물러서라.",
                "귀하의 과거를 반성하고 내일을 대비하라.",
                "자만심을 버리고 반성하는 자세가 필요한 시기이다."
        };
        Random random133 = new Random();
        int index133 = random.nextInt(CowFortune_December.length);
        String selectedFortune133 = CowFortune_December[index]; //소띠 丑 랜덤으로 운세 가져오기

        String[] TigerFortune_December = {
                "달도 차면 기운다는 것을 명심하라.",
                "옛 동창들과 어울려 예기하는 것이 길하다.",
                "강한 고집을 흉하다. 주의하는 것이 좋으리라.",
                "이성운은 좋지만 갈등이 생길 우려가 있다.",
                "주위사람들의 일로 인해 입장이 난처해질 수 있다."
        };
        Random random134 = new Random();
        int index134 = random.nextInt(TigerFortune_December.length);
        String selectedFortune134 = TigerFortune_December[index]; //범띠 寅 랜덤으로 운세 가져오기

        String[] RabbitFortune_December = {
                "약간 불안정한 하루가 될 것 같다.",
                "지금 추진하고 있는 일에 약간의 클레임이 걸릴 가능성이 있다.",
                "컨디션이 저조해서 업무에 잔실수를 많이 하게 된다.",
                "골치 아프던 문제 하나가 우연히 해결될 것 같다.",
                "사전 연락을 확실하게 하는 것이 좋으리라."
        };
        Random random135 = new Random();
        int index135 = random.nextInt(RabbitFortune_December.length);
        String selectedFortune135 = RabbitFortune_December[index]; //랜덤으로 토끼띠 卯 운세 가져오기

        String[] DragonFortune_December = {
                "귀하가 가지고 있는 재능과 지식을 널리 활용해야 하리라.",
                "꽃보다는 열매라는 식으로 실속을 취하라.",
                "귀하의 본분을 잊지 말고 운이 좋아진다는 것을 명심하라.",
                "안정을 취하세요. 금전, 이성문제, 모두 유리하리라.",
                "모든 것은 시와 때가 있는 법. 기다릴 줄 아는 지혜가 필요하다."
        };
        Random random136 = new Random();
        int index136 = random.nextInt(DragonFortune_December.length);
        String selectedFortune136 = DragonFortune_December[index]; //랜덤으로 용띠 辰 운세 가져오기

        String[] SnakeFortune_December = {
                "원하는 일은 비교적 빨리 이루어지지만 주의 깊은 통찰력이 필요한 시기이다.",
                "흔들리지 않는 굳건한 마음을 유지하는 게 좋습니다.",
                "사욕을 버리고 자신의 것을 덜어 공공의 이익에 봉사해야 하리라.",
                "환경을 극복하는 데 가장 쉬운 길을 택하라.",
                "윗사람의 조언을 받아라. 배울 점이 많다."
        };
        Random random137 = new Random();
        int index137= random.nextInt(SnakeFortune_December.length);
        String selectedFortune137 = SnakeFortune_December[index]; //랜덤으로 뱀띠 巳 운세 가져오기

        String[] HorseFortune_December = {
                "자신의 고집을 버리고 어진 사람과 대화하라.",
                "좋아하는 음식이나 취미 생활을 하는 것이 길하다.",
                "주관이 뚜렷하지 못하다. 주관을 확실하게 밝혀라.",
                "직장에서 스트레스를 받을 일이 있다.",
                "주변 사람들을 친절하게 대하라."
        };
        Random random138 = new Random();
        int index138 = random.nextInt(HorseFortune_December.length);
        String selectedFortune138 = HorseFortune_December[index]; //랜덤으로 말띠 午 운세 가져오기

        String[] SheepFortune_December = {
                "인생에 쉬운 것은 아무것도 없다.",
                "고난을 이겨내는 지혜가 필요한 시기이다.",
                "사업을 하는 귀하는 때로는 동업자에게 양보를 하는 것도 길하다.",
                "말을 조심하라. 일이 차차 해결 될 것이다.",
                "모든 것을 순서대로 차근차근. 서두를 필요가 없다."
        };
        Random random139 = new Random();
        int index139 = random.nextInt(SheepFortune_December.length);
        String selectedFortune139 = SheepFortune_December[index]; //랜덤으로 양띠 未 운세 가져오기

        String[] MonkeyFortune_December = {
                "유혹에 흔들리지 말라.",
                "안정을 취하며 조금 여유를 갖는 게 좋을 듯하다.",
                "처음의 마음가짐을 유지한 채 기다리면 성공의 길이 보인다.",
                "가족과 즐거운 시간을 가질 수 있다. 귀하가 하기 나름이다."
        };
        Random random140 = new Random();
        int index140= random.nextInt(MonkeyFortune_December.length);
        String selectedFortune140 = MonkeyFortune_December[index]; //랜덤으로 원숭이띠 申 운세 가져오기

        String[] ChickenFortune_December = {
                "명랑한 마음으로 잠깐 기다려라.",
                "외출하면 귀인을 만날 수 있다.",
                "아랫사람의 의견에 귀를 기울여라.",
                "언제나 말실수를 조심해야 한다.",
                "조상을 잘 모셔야만 나쁜 일을 면한다."
        };
        Random random141 = new Random();
        int index141 = random.nextInt(ChickenFortune_December.length);
        String selectedFortune141 = ChickenFortune_December[index]; //랜덤으로 닭띠 酉 운세 가져오기

        String[] DogFortune_December = {
                "유혹하는 말에 흔들리지 말고 소신대로 밀고 나가면 좋은 결과가 있을 거예요. 특히 금전과 관련된 유혹은 단호하게 뿌리치는 것이 좋답니다.",
                "원칙에 어긋나지 않게 착실하고 부지런하게 노력하면 좋은 성과가 따라올 것입니다. 남의 노력이 물거품 되지 않도록 부정적인 방법은 무조건 피하세요.",
                "지금 생활이 허전하게 느껴지지만 당장에는 큰일을 하지 않는 것이 좋답니다. 일상에서 무기력함을 느낀다면 새로운 취미 생활을 찾아보는 것이 좋겠네요.",
                "주위에 선심을 베풀고 겸손한 자세로 임하니 지위가 올라간 기분이 드는 날입니다. 작은 나눔이 큰 기쁨으로 오니 작은 실천부터 해보세요.",
                "자신이 가진 것을 감추기보다는 드러내는 것이 상대의 호감을 얻을 수 있습니다. 베이지색의 옷이나 모자를 착용하면 호감을 높일 수 있습니다."
        };
        Random random142 = new Random();
        int index142= random.nextInt(DogFortune_December.length);
        String selectedFortune142 = DogFortune_December[index]; //랜덤으로 개띠 戌 운세 가져오기

        String[] PigFortune_December = {
                "책임감 있고 성실한 모습으로 열심히 노력하면 큰 성과가 돌아오는 하루입니다. 성과를 내세우지 말고 겸손하면 더 많은 것을 얻을 수 있을 것입니다.",
                "나에 대한 선입견이나 편견을 가졌던 사람들이 호의적인 모습을 보일 수 있어요. 나에게 무언가를 앗아가기 위한 흑심은 없는지 의심해봐야 합니다.",
                "이루고 싶은 것이 있다면 실행하기에 앞서 많이 생각하고 계획을 세워야 해요. 빠르게 실천에 옮기기보단 신중하게 움직이는 것이 성공을 불러올 것입니다.",
                "실수하지 않도록 아는 것도 두 번 세 번 확인하는 것이 나에게 유리해요. 주변에 개띠나 쥐띠가 있다면 도움을 요청해 보세요.",
                "일하기 전 시간을 단축할 수 있는 효율에 대해서 생각해 보는 것이 좋습니다. 오늘은 초코빵이나 간단한 간식거리를 먹은 후 일을 시작해 보세요."
        };
        Random random143 = new Random();
        int index143= random.nextInt(PigFortune_December.length);
        String selectedFortune143 = PigFortune_December[index]; //랜덤으로 돼지띠 亥 운세 가져오기

        System.out.println("    ____        ____   ____   _________    ____        ");
        System.out.println("    |  |        |  |   |  |   |  ______|  |   | /ˉˉ/   ");
        System.out.println("    |  |        |  |   |  |   |  |        |   |/  /    ");
        System.out.println("    |  |        |  |   |  |   |  |        |      /     ");
        System.out.println("    |  |_____   |  |___|  |   |  |_____   |   |\\  \\  ");
        System.out.println("    |________|  |_________|   |________|  |___| \\__\\ ");
        System.out.println();
        System.out.println("월을 입력해주세요. 예) 1, 2..");
        int birthMonth = scanner.nextInt(); //생년 월 입력받기
        if (birthMonth == 1) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune1);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune2);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune3);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune4);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune5);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune6);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune7);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune8);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune9);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune10);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune11);
            }
        }
        if (birthMonth == 2) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune12);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune13);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune14);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune15);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune16);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune17);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune18);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune19);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune20);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune21);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune22);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune23);
            }
        }
        if (birthMonth == 3) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune24);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune25);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune26);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune27);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune28);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune29);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune30);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune31);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune32);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune33);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune34);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune35);
            }
        }
        if (birthMonth == 4) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune36);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune37);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune38);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune39);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune40);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune41);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune42);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune43);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune44);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune45);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune46);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune47);
            }
        }
        if (birthMonth == 5) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune48);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune49);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune50);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune51);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune52);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune53);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune54);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune55);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune56);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune57);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune58);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune59);
            }
        }
        if (birthMonth == 6) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune60);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune61);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune62);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune63);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune64);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune65);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune66);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune67);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune68);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune69);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune70);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune71);
            }
        }
        if (birthMonth == 7) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune72);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune73);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune74);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune75);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune76);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune77);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune78);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune79);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune80);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune81);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune82);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune83);
            }
        }
        if (birthMonth == 8) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune84);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune85);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune86);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune87);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune88);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune89);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune90);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune91);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune92);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune93);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune94);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune95);
            }
        }
        if (birthMonth == 9) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune96);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune97);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune98);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune99);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune100);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune101);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune102);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune103);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune104);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune105);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune106);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune107);
            }
        }
        if (birthMonth == 10) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune108);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune109);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune110);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune111);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune112);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune113);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune114);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune115);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune116);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune117);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune118);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune119);
            }
        }
        if (birthMonth == 11) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune120);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune121);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune122);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune123);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune124);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune125);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune126);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune127);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune128);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune129);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune130);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune131);
            }
        }
        if (birthMonth == 12) {
            System.out.println("당신의 띠는 무엇인가요? 예) 쥐띠, 소띠..");
            fortuneTelling = scanner.next(); //띠 입력받기
            if ("쥐띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [쥐띠 子] : " + selectedFortune132);
            }
            else if ("소띠".equals(fortuneTelling)){
                System.out.println("오늘의 운세 [소띠 丑] : " + selectedFortune133);
            }
            else if ("범띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [범띠 寅] : " + selectedFortune134);
            }
            else if ("토끼띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [토끼띠 卯] : " + selectedFortune135);
            }
            else if ("용띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [용띠 辰] : " + selectedFortune136);
            }
            else if ("뱀띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [뱀띠 巳] : " + selectedFortune137);
            }
            else if ("말띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [말띠 午] : " + selectedFortune138);
            }
            else if ("양띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [양띠 未] : " + selectedFortune139);
            }
            else if ("원숭이띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [원숭이띠 申] : " + selectedFortune140);
            }
            else if ("닭띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [닭띠 酉] : " + selectedFortune141);
            }
            else if ("개띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [개띠 戌] : " + selectedFortune142);
            }
            else if ("돼지띠".equals(fortuneTelling)) {
                System.out.println("오늘의 운세 [돼지띠 亥] : " + selectedFortune143);
            }
        }
    }
}
