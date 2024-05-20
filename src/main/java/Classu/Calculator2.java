package Classu;

public class Calculator2 {
    private String result1 = "";
    private String result2 = "";
    private String result3 = "";
    private String result4 = "";
    private String result5 = "";
    private String result6 = "";
    private String result7 = "";
    private String result8 = "";
    private String result9 = "";
    private String result10 = "";
    private String result11 = "";
    private String result12 = "";
    private String result13 = "";
    private String result14 = "";
    private String result15 = "";


    public String getResult1() {
        return result1;
    }

    public void setResult1(String result1) {
        this.result1 = result1;
    }

    public String getResult2() {
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2;
    }

    public String getResult3() {
        return result3;
    }

    public void setResult3(String result3) {
        this.result3 = result3;
    }

    public String getResult4() {
        return result4;
    }

    public void setResult4(String result4) {
        this.result4 = result4;
    }

    public String getResult5() {
        return result5;
    }

    public void setResult5(String result5) {
        this.result5 = result5;
    }

    public String getResult6() {
        return result6;
    }

    public void setResult6(String result6) {
        this.result6 = result6;
    }

    public String getResult7() {
        return result7;
    }

    public void setResult7(String result7) {
        this.result7 = result7;
    }

    public String getResult8() {
        return result8;
    }

    public void setResult8(String result8) {
        this.result8 = result8;
    }

    public String getResult9() {
        return result9;
    }

    public void setResult9(String result9) {
        this.result9 = result9;
    }

    public String getResult10() {
        return result10;
    }

    public void setResult10(String result10) {
        this.result10 = result10;
    }

    public String getResult11() {
        return result11;
    }

    public void setResult11(String result11) {
        this.result11 = result11;
    }

    public String getResult12() {
        return result12;
    }

    public void setResult12(String result12) {
        this.result12 = result12;
    }

    public String getResult13() {
        return result13;
    }

    public void setResult13(String result13) {
        this.result13 = result13;
    }

    public String getResult14() {
        return result14;
    }

    public void setResult14(String result14) {
        this.result14 = result14;
    }

    public String getResult15() {
        return result15;
    }

    public void setResult15(String result15) {
        this.result15 = result15;
    }

    public Calculator2() {
    }

    public Calculator2(String result1, String result2, String result3, String result4, String result5, String result6, String result7, String result8, String result9, String result10, String result11, String result12, String result13, String result14, String result15) {
        this.result1 = result1;
        this.result2 = result2;
        this.result3 = result3;
        this.result4 = result4;
        this.result5 = result5;
        this.result6 = result6;
        this.result7 = result7;
        this.result8 = result8;
        this.result9 = result9;
        this.result10 = result10;
        this.result11 = result11;
        this.result12 = result12;
        this.result13 = result13;
        this.result14 = result14;
        this.result15 = result15;
    }

    //Мультіфакторіальні захворювання
    public void calculateResults(String com1Selection, String com2Selection) {
        int probabilityHealthy = 0;
        int probabilityHeartAttack = 0;
        int probabilityHypertension = 0;
        int probabilityDiabetes = 0;
        int probabilityAstma = 0;
        int probabilityRakLegen = 0;
        int probabilityTalasemia = 0;
        int probabilityFKY = 0;
        int probabilityMuskoviszudoz = 0;
        int probabilityXTC = 0;
        int probabilityXG = 0;
        int probabilityXM = 0;
        int probabilitySD = 0;
        int probabilityGemofilia = 0;
        int probabilityPN = 0;

        if (com1Selection.equals("нема захворювань") && com2Selection.equals("нема захворювань")) {
            probabilityHealthy = 99;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if ((com1Selection.equals("інфаркт міокарда") && com2Selection.equals("нема захворювань")) ||
                (com1Selection.equals("нема захворювань") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 69;
            probabilityHeartAttack = 30;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if ((com1Selection.equals("гіпертонія") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 34;
            probabilityHeartAttack = 0;
            probabilityHypertension = 65;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("нема захворювань") && com2Selection.equals("гіпертонія")){
            probabilityHealthy = 64;
            probabilityHeartAttack = 0;
            probabilityHypertension = 35;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("інфаркт міокарда")) {
            probabilityHealthy = 40;
            probabilityHeartAttack = 59;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if ((com1Selection.equals("гіпертонія") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 9;
            probabilityHeartAttack = 25;
            probabilityHypertension = 65;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("гіпертонія")){
            probabilityHealthy = 9;
            probabilityHeartAttack = 35;
            probabilityHypertension = 55;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 19;
            probabilityHeartAttack = 0;
            probabilityHypertension = 80;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } if (com1Selection.equals("нема захворювань") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 82;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 17;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 29;
            probabilityHeartAttack = 53;
            probabilityHypertension = 0;
            probabilityDiabetes = 17;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("цукровий діабет 2 типу")) {
            probabilityHealthy = 19;
            probabilityHeartAttack = 0;
            probabilityHypertension = 63;
            probabilityDiabetes = 17;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 39;
            probabilityHeartAttack = 0;
            probabilityHypertension = 43;
            probabilityDiabetes = 17;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("цукровий діабет 2 типу"))) {
            probabilityHealthy = 25;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 74;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("нема захворювань") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 64;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 35;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 34;
            probabilityHeartAttack = 30;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 35;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("бронхіальна астма")) {
            probabilityHealthy = 11;
            probabilityHeartAttack = 0;
            probabilityHypertension = 53;
            probabilityDiabetes = 0;
            probabilityAstma = 35;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("бронхіальна астма") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 39;
            probabilityHeartAttack = 0;
            probabilityHypertension = 33;
            probabilityDiabetes = 0;
            probabilityAstma = 35;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("бронхіальна астма") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("бронхіальна астма"))) {
            probabilityHealthy = 24;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 40;
            probabilityAstma = 35;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("бронхіальна астма") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("бронхіальна астма"))) {
            probabilityHealthy = 24;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 75;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("нема захворювань") && com2Selection.equals("рак легень") ||
                (com1Selection.equals("рак легень") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 89;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 10;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("рак легень") ||
                (com1Selection.equals("рак легень") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 49;
            probabilityHeartAttack = 40;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 10;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("рак легень")) {
            probabilityHealthy = 34;
            probabilityHeartAttack = 0;
            probabilityHypertension = 55;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 10;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("рак легень") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 54;
            probabilityHeartAttack = 0;
            probabilityHypertension = 35;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 10;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("рак легень") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("рак легень"))) {
            probabilityHealthy = 49;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 40;
            probabilityAstma = 0;
            probabilityRakLegen = 10;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("рак легень") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("рак легень"))) {
            probabilityHealthy = 54;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 35;
            probabilityRakLegen = 10;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("рак легень") && com2Selection.equals("рак легень") ||
                (com1Selection.equals("рак легень") && com2Selection.equals("рак легень"))) {
            probabilityHealthy = 79;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 20;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("нема захворювань") && com2Selection.equals("таласемія") ||
                (com1Selection.equals("таласемія") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 59;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 40;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("таласемія") ||
                (com1Selection.equals("таласемія") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 29;
            probabilityHeartAttack = 30;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 40;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("таласемія")) {
            probabilityHealthy = 14;
            probabilityHeartAttack = 0;
            probabilityHypertension = 45;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 40;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("таласемія") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 34;
            probabilityHeartAttack = 0;
            probabilityHypertension = 25;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 40;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("таласемія") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("таласемія"))) {
            probabilityHealthy = 19;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 40;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 40;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("таласемія") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("таласемія"))) {
            probabilityHealthy = 24;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 35;
            probabilityRakLegen = 0;
            probabilityTalasemia = 40;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("таласемія") && com2Selection.equals("рак легень") ||
                (com1Selection.equals("рак легень") && com2Selection.equals("таласемія"))) {
            probabilityHealthy = 39;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 20;
            probabilityTalasemia = 40;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("таласемія") && com2Selection.equals("таласемія") ||
                (com1Selection.equals("таласемія") && com2Selection.equals("таласемія"))) {
            probabilityHealthy = 49;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 50;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else  if (com1Selection.equals("нема захворювань") && com2Selection.equals("фенілкетонурія") ||
                (com1Selection.equals("фенілкетонурія") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 64;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 35;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("фенілкетонурія") ||
                (com1Selection.equals("фенілкетонурія") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 24;
            probabilityHeartAttack = 40;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 35;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("фенілкетонурія")) {
            probabilityHealthy = 9;
            probabilityHeartAttack = 0;
            probabilityHypertension = 55;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 35;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("фенілкетонурія") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 19;
            probabilityHeartAttack = 0;
            probabilityHypertension = 45;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 35;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("фенілкетонурія") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("фенілкетонурія"))) {
            probabilityHealthy = 34;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 30;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 35;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("фенілкетонурія") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("фенілкетонурія"))) {
            probabilityHealthy = 19;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 45;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 35;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("фенілкетонурія") && com2Selection.equals("рак легень") ||
                (com1Selection.equals("рак легень") && com2Selection.equals("фенілкетонурія"))) {
            probabilityHealthy = 46;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 18;
            probabilityTalasemia = 0;
            probabilityFKY = 35;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("фенілкетонурія") && com2Selection.equals("таласемія") ||
                (com1Selection.equals("таласемія") && com2Selection.equals("фенілкетонурія"))) {
            probabilityHealthy = 24;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 40;
            probabilityFKY = 35;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("фенілкетонурія") && com2Selection.equals("фенілкетонурія") ||
                (com1Selection.equals("фенілкетонурія") && com2Selection.equals("фенілкетонурія"))) {
            probabilityHealthy = 39;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 60;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else  if (com1Selection.equals("нема захворювань") && com2Selection.equals("мусковісцидоз") ||
                (com1Selection.equals("мусковісцидоз") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 67;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 32;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("мусковісцидоз") ||
                (com1Selection.equals("мусковісцидоз") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 31;
            probabilityHeartAttack = 36;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 32;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("мусковісцидоз")) {
            probabilityHealthy = 17;
            probabilityHeartAttack = 0;
            probabilityHypertension = 50;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 32;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("мусковісцидоз") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 27;
            probabilityHeartAttack = 0;
            probabilityHypertension = 40;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 32;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("мусковісцидоз") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("мусковісцидоз"))) {
            probabilityHealthy = 42;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 25;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 32;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("мусковісцидоз") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("мусковісцидоз"))) {
            probabilityHealthy = 22;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 45;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 32;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("мусковісцидоз") && com2Selection.equals("рак легень") ||
                (com1Selection.equals("рак легень") && com2Selection.equals("мусковісцидоз"))) {
            probabilityHealthy = 49;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 18;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 32;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("мусковісцидоз") && com2Selection.equals("таласемія") ||
                (com1Selection.equals("таласемія") && com2Selection.equals("мусковісцидоз"))) {
            probabilityHealthy = 32;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 35;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 32;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("мусковісцидоз") && com2Selection.equals("фенілкетонурія") ||
                (com1Selection.equals("фенілкетонурія") && com2Selection.equals("мусковісцидоз"))) {
            probabilityHealthy = 17;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 50;
            probabilityMuskoviszudoz = 32;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("мусковісцидоз") && com2Selection.equals("мусковісцидоз") ||
                (com1Selection.equals("мусковісцидоз") && com2Selection.equals("мусковісцидоз"))) {
            probabilityHealthy = 45;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 54;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else  if (com1Selection.equals("нема захворювань") && com2Selection.equals("хвороба Тея-Сакса") ||
                (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 87;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("хвороба Тея-Сакса") ||
                (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 20;
            probabilityHeartAttack = 67;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("хвороба Тея-Сакса")) {
            probabilityHealthy = 17;
            probabilityHeartAttack = 0;
            probabilityHypertension = 70;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 27;
            probabilityHeartAttack = 0;
            probabilityHypertension = 60;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("хвороба Тея-Сакса"))) {
            probabilityHealthy = 42;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 45;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("хвороба Тея-Сакса"))) {
            probabilityHealthy = 37;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 50;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("рак легень") ||
                (com1Selection.equals("рак легень") && com2Selection.equals("хвороба Тея-Сакса"))) {
            probabilityHealthy = 59;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 28;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("таласемія") ||
                (com1Selection.equals("таласемія") && com2Selection.equals("хвороба Тея-Сакса"))) {
            probabilityHealthy = 41;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 46;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("фенілкетонурія") ||
                (com1Selection.equals("фенілкетонурія") && com2Selection.equals("хвороба Тея-Сакса"))) {
            probabilityHealthy = 26;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 61;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("мусковісцидоз") ||
                (com1Selection.equals("мусковісцидоз") && com2Selection.equals("хвороба Тея-Сакса"))) {
            probabilityHealthy = 55;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 32;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("хвороба Тея-Сакса") ||
                (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("хвороба Тея-Сакса"))) {
            probabilityHealthy = 74;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 25;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else  if (com1Selection.equals("нема захворювань") && com2Selection.equals("хвороба Гоше") ||
                (com1Selection.equals("хвороба Гоше") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 74;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("хвороба Гоше") ||
                (com1Selection.equals("хвороба Гоше") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 31;
            probabilityHeartAttack = 43;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("хвороба Гоше")) {
            probabilityHealthy = 20;
            probabilityHeartAttack = 0;
            probabilityHypertension = 54;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 30;
            probabilityHeartAttack = 0;
            probabilityHypertension = 44;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("хвороба Гоше"))) {
            probabilityHealthy = 26;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 48;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("хвороба Гоше"))) {
            probabilityHealthy = 40;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 34;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("рак легень") ||
                (com1Selection.equals("рак легень") && com2Selection.equals("хвороба Гоше"))) {
            probabilityHealthy = 53;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 21;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("таласемія") ||
                (com1Selection.equals("таласемія") && com2Selection.equals("хвороба Гоше"))) {
            probabilityHealthy = 36;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 38;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("фенілкетонурія") ||
                (com1Selection.equals("фенілкетонурія") && com2Selection.equals("хвороба Гоше"))) {
            probabilityHealthy = 25;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 49;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("мусковісцидоз") ||
                (com1Selection.equals("мусковісцидоз") && com2Selection.equals("хвороба Гоше"))) {
            probabilityHealthy = 41;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 33;
            probabilityXTC = 0;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("хвороба Тея-Сакса") ||
                (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("хвороба Гоше"))) {
            probabilityHealthy = 62;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 25;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("хвороба Гоше") ||
                (com1Selection.equals("хвороба Гоше") && com2Selection.equals("хвороба Гоше"))) {
            probabilityHealthy = 44;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 55;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else  if (com1Selection.equals("нема захворювань") && com2Selection.equals("хвороба Марфана") ||
                (com1Selection.equals("хвороба Марфана") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 49;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("хвороба Марфана") ||
                (com1Selection.equals("хвороба Марфана") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 24;
            probabilityHeartAttack = 25;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("хвороба Марфана")) {
            probabilityHealthy = 4;
            probabilityHeartAttack = 0;
            probabilityHypertension = 45;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 14;
            probabilityHeartAttack = 0;
            probabilityHypertension = 35;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("хвороба Марфана"))) {
            probabilityHealthy = 9;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 40;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("хвороба Марфана"))) {
            probabilityHealthy = 22;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 27;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("рак легень") ||
                (com1Selection.equals("рак легень") && com2Selection.equals("хвороба Марфана"))) {
            probabilityHealthy = 31;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 18;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("таласемія") ||
                (com1Selection.equals("таласемія") && com2Selection.equals("хвороба Марфана"))) {
            probabilityHealthy = 18;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 31;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("фенілкетонурія") ||
                (com1Selection.equals("фенілкетонурія") && com2Selection.equals("хвороба Марфана"))) {
            probabilityHealthy = 9;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 40;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("мусковісцидоз") ||
                (com1Selection.equals("мусковісцидоз") && com2Selection.equals("хвороба Марфана"))) {
            probabilityHealthy = 23;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 26;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("хвороба Тея-Сакса") ||
                (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("хвороба Марфана"))) {
            probabilityHealthy = 37;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("хвороба Гоше") ||
                (com1Selection.equals("хвороба Гоше") && com2Selection.equals("хвороба Марфана"))) {
            probabilityHealthy = 4;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 45;
            probabilityXM = 50;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("хвороба Марфана") ||
                (com1Selection.equals("хвороба Марфана") && com2Selection.equals("хвороба Марфана"))) {
            probabilityHealthy = 24;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 75;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else  if (com1Selection.equals("нема захворювань") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 50;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("нема захворювань")) {
            probabilityHealthy = 65;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 30;
            probabilityHeartAttack = 20;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("інфаркт міокарда")) {
            probabilityHealthy = 37;
            probabilityHeartAttack = 28;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 2;
            probabilityHeartAttack = 0;
            probabilityHypertension = 48;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 27;
            probabilityHeartAttack = 0;
            probabilityHypertension = 38;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("цукровий діабет 2 типу")) {
            probabilityHealthy = 26;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 39;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 11;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 39;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("бронхіальна астма")) {
            probabilityHealthy = 41;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 24;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("бронхіальна астма") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 25;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 25;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        }else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("рак легень")) {
            probabilityHealthy = 47;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 18;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("рак легень") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 32;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 18;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        }else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("таласемія")) {
            probabilityHealthy = 31;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 34;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("таласемія") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 20;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 30;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("фенілкетонурія")) {
            probabilityHealthy = 24;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 41;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("фенілкетонурія") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 10;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 40;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("мусковісцидоз") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 24;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 26;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("мусковісцидоз")) {
            probabilityHealthy = 39;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 26;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("хвороба Тея-Сакса")) {
            probabilityHealthy = 53;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 38;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("хвороба Гоше")) {
            probabilityHealthy = 20;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 45;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 5;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 45;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("хвороба Марфана")) {
            probabilityHealthy = 15;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 0;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 50;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("синдром Дауна") ||
                com2Selection.equals("синдром Дауна") && com1Selection.equals("синдром Дауна")) {
            probabilityHealthy = 25;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 75;
            probabilityGemofilia = 0;
            probabilityPN = 0;
        } else  if (com1Selection.equals("нема захворювань") && com2Selection.equals("гемофілія") ||
                (com1Selection.equals("гемофілія") && com2Selection.equals("нема захворювань"))) {
            probabilityHealthy = 49;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("гемофілія") ||
                (com1Selection.equals("гемофілія") && com2Selection.equals("інфаркт міокарда"))) {
            probabilityHealthy = 22;
            probabilityHeartAttack = 27;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("гемофілія")) {
            probabilityHealthy = 2;
            probabilityHeartAttack = 0;
            probabilityHypertension = 47;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 17;
            probabilityHeartAttack = 0;
            probabilityHypertension = 32;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("цукровий діабет 2 типу") ||
                (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("гемофілія"))) {
            probabilityHealthy = 6;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 43;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("бронхіальна астма") ||
                (com1Selection.equals("бронхіальна астма") && com2Selection.equals("гемофілія"))) {
            probabilityHealthy = 25;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 24;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("рак легень") ||
                (com1Selection.equals("рак легень") && com2Selection.equals("гемофілія"))) {
            probabilityHealthy = 31;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 18;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("таласемія") ||
                (com1Selection.equals("таласемія") && com2Selection.equals("гемофілія"))) {
            probabilityHealthy = 13;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 36;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("фенілкетонурія") ||
                (com1Selection.equals("фенілкетонурія") && com2Selection.equals("гемофілія"))) {
            probabilityHealthy = 10;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 39;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("мусковісцидоз") ||
                (com1Selection.equals("мусковісцидоз") && com2Selection.equals("гемофілія"))) {
            probabilityHealthy = 21;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 28;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("хвороба Тея-Сакса") ||
                (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("гемофілія"))) {
            probabilityHealthy = 37;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("хвороба Гоше") ||
                (com1Selection.equals("хвороба Гоше") && com2Selection.equals("гемофілія"))) {
            probabilityHealthy = 8;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 41;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("хвороба Марфана") ||
                (com1Selection.equals("хвороба Марфана") && com2Selection.equals("гемофілія"))) {
            probabilityHealthy = 4;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 45;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 0;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("гемофілія")) {
            probabilityHealthy = 15;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 50;
            probabilityPN = 0;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("гемофілія") ||
                com1Selection.equals("гемофілія") && com2Selection.equals("гемофілія")) {
            probabilityHealthy = 0;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 99;
            probabilityPN = 0;
        } else  if (com1Selection.equals("нема захворювань") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 49;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("нема захворювань")) {
            probabilityHealthy = 74;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("інфаркт міокарда") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 25;
            probabilityHeartAttack = 24;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("інфаркт міокарда")) {
            probabilityHealthy = 47;
            probabilityHeartAttack = 27;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("гіпертонія") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 4;
            probabilityHeartAttack = 0;
            probabilityHypertension = 45;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("гіпертонія")) {
            probabilityHealthy = 40;
            probabilityHeartAttack = 0;
            probabilityHypertension = 34;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("цукровий діабет 2 типу")) {
            probabilityHealthy = 41;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 33;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("цукровий діабет 2 типу") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 8;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 41;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("бронхіальна астма")) {
            probabilityHealthy = 52;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 22;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("бронхіальна астма") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 23;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 26;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        }else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("рак легень")) {
            probabilityHealthy = 57;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 17;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("рак легень") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 31;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 18;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        }else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("таласемія")) {
            probabilityHealthy = 42;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 32;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("таласемія") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 20;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 29;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("фенілкетонурія")) {
            probabilityHealthy = 34;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 40;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("фенілкетонурія") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 8;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 41;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("мусковісцидоз") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 21;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 28;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("мусковісцидоз")) {
            probabilityHealthy = 51;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 23;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("хвороба Тея-Сакса")) {
            probabilityHealthy = 61;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 13;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("хвороба Тея-Сакса") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 37;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 12;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("хвороба Гоше")) {
            probabilityHealthy = 30;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 44;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("хвороба Гоше") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 4;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 45;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("хвороба Марфана")) {
            probabilityHealthy = 25;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 49;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("хвороба Марфана") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 0;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 49;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("синдром Дауна")) {
            probabilityHealthy = 25;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 50;
            probabilityGemofilia = 0;
            probabilityPN = 25;
        } else if (com1Selection.equals("синдром Дауна") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 15;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 35;
            probabilityGemofilia = 0;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("гемофілія")) {
            probabilityHealthy = 24;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 50;
            probabilityPN = 25;
        } else if (com1Selection.equals("гемофілія") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 0;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 49;
            probabilityPN = 50;
        } else if (com1Selection.equals("полікістоз нирок") && com2Selection.equals("полікістоз нирок") ||
                com1Selection.equals("полікістоз нирок") && com2Selection.equals("полікістоз нирок")) {
            probabilityHealthy = 0;
            probabilityHeartAttack = 0;
            probabilityHypertension = 0;
            probabilityDiabetes = 0;
            probabilityAstma = 0;
            probabilityRakLegen = 0;
            probabilityTalasemia = 0;
            probabilityFKY = 0;
            probabilityMuskoviszudoz = 0;
            probabilityXTC = 0;
            probabilityXG = 0;
            probabilityXM = 0;
            probabilitySD = 1;
            probabilityGemofilia = 0;
            probabilityPN = 99;
        }

        result1 = "повністью здоровий: " + probabilityHealthy + "%";
        result2 = "інфаркт міокарда: " + probabilityHeartAttack + "%";
        result3 = "гіпертонія: " + probabilityHypertension + "%";
        result4 = "цукровий діабет 2 типу: " + probabilityDiabetes + "%";
        result5 = "бронхіальна астма: " + probabilityAstma + "%";
        result6 = "рак легень: " + probabilityRakLegen + "%";
        result7 = "таласемія: " + probabilityTalasemia + "%";
        result8 = "фенілкетонурія: " + probabilityFKY + "%";
        result9 = "мусковісцидоз: " + probabilityMuskoviszudoz + "%";
        result10 = "хвороба Тея-Сакса: " + probabilityXTC + "%";
        result11 = "хвороба Гоше: " + probabilityXG + "%";
        result12 = "хвороба Марфана: " + probabilityXM + "%";
        result13 = "синдром Дауна: " + probabilitySD + "%";
        result14 = "гемофілія: " + probabilityGemofilia + "%";
        result15 = "полікістоз нирок: " + probabilityPN + "%";
    }


    @Override
    public String toString() {
        return "Calculator{" +
                "result1='" + result1 + '\'' +
                ", result2='" + result2 + '\'' +
                ", result3='" + result3 + '\'' +
                ", result4='" + result4 + '\'' +
                ", result5='" + result5 + '\'' +
                ", result6='" + result6 + '\'' +
                ", result7='" + result7 + '\'' +
                ", result8='" + result8 + '\'' +
                ", result9='" + result9 + '\'' +
                ", result10='" + result10 + '\'' +
                ", result11='" + result11 + '\'' +
                ", result12='" + result12 + '\'' +
                ", result13='" + result13 + '\'' +
                ", result14='" + result14 + '\'' +
                ", result15='" + result15 + '\'' +
                '}';
    }
}
