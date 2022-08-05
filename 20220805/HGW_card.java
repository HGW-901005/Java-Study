class HGW_pokers {

    String HGW_CardDraw() {

        String card;
        int cardNum = (int) ((Math.random() * 13) + 1);
        String cardShape;
        int cardShapeNum = (int) (Math.random() * 4);

        if (cardShapeNum < 1) {
            cardShape = "♥";
        } else if (cardShapeNum >= 1 && cardShapeNum < 2) {
            cardShape = "♣";
        } else if (cardShapeNum >= 2 && cardShapeNum < 3) {
            cardShape = "◆";
        } else {
            cardShape = "♠";
        }

        String cardNum2 = "";

        if (cardNum == 1) {
            cardNum2 = "A";
        } else if (cardNum == 11) {
            cardNum2 = "J";
        } else if (cardNum == 12) {
            cardNum2 = "Q";
        } else if (cardNum == 13) {
            cardNum2 = "K";
        } else {
            cardNum2 = String.valueOf(cardNum);
        }

        card = cardShape + cardNum2;
        return card;
    }
}