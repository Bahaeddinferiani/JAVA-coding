import java.util.Scanner;

class score {

    public double moy1ere, moy2eme, moybac, matiere1, matiere2, matiere3, matiere4;
    public int age, rang1, rang2, effectif1, effectif2;

    public Double scoremoyenne() {
        double moyg;

        moyg = (moy1ere + moy2eme) / 2;
        if (moyg > 15) {
            return 30d;
        }
        if (moyg > 10) {

            return 20 * (moyg - 10) * 0.3;
        } else {
            return 0d;
        }

    }

    public double scorerang() {
        double y, ri1, ri2, rg1 = rang1, rg2 = rang2, ef1 = effectif1, ef2 = effectif2;

        ri1 = 100 - (((rg1 - 1) / ef1) * 700) / 3;
        ri2 = 100 - (((rg2 - 1) / ef2) * 700) / 3;
        y = ((ri1 + ri2) / 2) * 0.7;
        return y;
    }

    public int scoreage() {
        int x = 5, y = 0;
        if (age > 22)
            return y;
        else
            return x;

    }

    public int scorebac() {
        if (moybac < 11)
            return 0;
        if (moybac < 12 & moybac >= 11)
            return 3;
        if (moybac < 14 & moybac >= 12)
            return 5;
        if (moybac < 16 & moybac >= 14)
            return 10;
        else
            return 15;
    }

    public double score2() {
        return (matiere1 + matiere2) / 2 + (matiere3 + matiere4) / 2;
    }

    public double score1() {
        return scorerang() + scoreage() + scoremoyenne() + scorebac();
    }

    public double scoretotal() {
        return score1() + score2();

    }

}

class concours_spécifique {
    public static void main(String[] args) {
        int taper;
        score f = new score();
        Scanner s = new Scanner(System.in);
        System.out.println("DONNER MOYENNE BAC : ");
        f.moybac = s.nextDouble();
        System.out.println("DONNER MOYENNE 1ERE : ");
        f.moy1ere = s.nextDouble();
        System.out.println("DONNER MOYENNE 2EME : ");
        f.moy2eme = s.nextDouble();
        System.out.println("SI VOTRE AGE = 22 TAPER 1 SINON TAPER 2 :");
        taper = s.nextInt();
        if (taper == 1)
            f.age = 21;
        else
            f.age = 23;
        System.out.println("DONNER RANG 1ERE: ");
        f.rang1 = s.nextInt();
        System.out.println("DONNER RANG 2EmE: ");
        f.rang2 = s.nextInt();
        System.out.println("DONNER EFFECTIF 1ErE: ");
        f.effectif1 = s.nextInt();
        System.out.println("DONNER EFFECTIF 2EME: ");
        f.effectif2 = s.nextInt();
        System.out.println("DONNER MOYENNE GENERALE EN FRANCAIS  : ");
        f.matiere1 = s.nextDouble();
        System.out.println("DONNER MOYENNE GENERALE EN ANGLAIS : ");
        f.matiere2 = s.nextDouble();
        System.out.println("DONNER MOYENNE GENERALE MATH : ");
        f.matiere3 = s.nextDouble();
        System.out.println("DONNER MOYENNE GENERALE PROGRAMMATION : ");
        f.matiere4 = s.nextDouble();
        System.out.println("////////////////////////////////////////////// ");
        System.out.println("VOTRE SCORE 1 = " + f.score1());
        System.out.println("VOTRE SCORE 2 = " + f.score2());
        System.out.println("VOTRE SCORE GLOBAL = " + f.scoretotal());

        s.close();

    }
}