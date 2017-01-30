package com.bird.assignment3.Test;

import com.bird.assignment3.Model.ChessPosition;
import com.bird.assignment3.Model.King;
import static junit.framework.Assert.assertEquals;


public class ChessPieceTest {
    public static boolean runTest(){
        try {
            KingsMoveIsCorrect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;

    }

    private static void KingsMoveIsCorrect() throws Exception {
        King kingAt0_0 = new King(new ChessPosition(0,0));
        assertEquals(kingAt0_0.canMoveTo(new ChessPosition(1,1)),true);
        //more test
    }
    //more test
}
