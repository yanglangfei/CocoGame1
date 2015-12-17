package com.ylf.jucaipen.cocogame1.sence;

import org.cocos2d.actions.interval.CCMoveBy;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

/**
 * Created by Administrator on 2015/12/17.
 */
public class GameLayer1 extends CCLayer {
    private CCSprite player;
    public GameLayer1(){
        player=CCSprite.sprite("girl10.png");
        player.setRotation(-10);
        CGPoint point=CGPoint.ccp(100, 100);
        player.setPosition(point);
        addChild(player);

        CGPoint point1=CGPoint.ccp(300, 100);
     //   CCJumpTo jumpTo=CCJumpTo.action(2, point1, 200, 2);
     //   player.runAction(jumpTo);

        CCMoveBy moveBy=CCMoveBy.action(2,point1);
        player.runAction(moveBy);

     /*   CCScaleBy scaleBy=CCScaleBy.action(2, 2);
        CCRotateTo rotateTo=CCRotateTo.action(3,180);
        player.runAction(rotateTo);
        player.runAction(scaleBy);
        CCHide hide=CCHide.action();
        CCShow show=CCShow.action();*/





       /* CGPoint cgPoint=CGPoint.ccp(100,100);
        CCMoveTo moveTo=CCMoveTo.action(2,cgPoint);
        player.runAction(moveTo);*/



    }
}
