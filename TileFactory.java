


/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public static Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
                tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 1:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 2:
                tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 3:
                tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 4:
                tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 5:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.getImage().mirrorVertically();
                tile.isSolid =false;
                break;
            case 6:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 7:
                tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 8:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 9:
                tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 10:
                tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 11:
                tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 12:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 13:
                tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 14:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 15:
            tile = new Tile("bridgeLogs.png",  TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            case 16:
            tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 17:
            tile= new Tile("grassHillLeft.png",  TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 18:
            tile= new SpikesTile("spikes.png",  TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 19:
            tile = new Key2("keyYellow.png",  TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            case 20:
            tile= new DoorLock("door_closedMid.png",  TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            
            case 28:
            tile= new Tile("stoneCenter.png",  TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
        
            case 21:
            tile= new Tile("door_closedTop.png",  TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            case 22:
            tile= new Tile("cloud3.png",  TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            case 23:
            tile = new Tile("tochLit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 24:
            tile = new Tile("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 25:
            tile = new DoorLock1("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 26:
            tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
          
            case 44:
            tile= new SpikesTile("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            
            case 27:
            tile= new Tile("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
       
            
            case 29:
            tile= new LavaTile("liquidLava.png",  TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            
             case 31:
            tile= new Tile("liquidLavaTop_mid.png",  TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            case 32:
            tile = new DoorLock2("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 33:
            tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 34:
            tile = new DoorLock3("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 35:
            tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 36:
            tile = new DoorLock4("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            
            case 30:
            tile = new Tile("bridge.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            
       
            case 37:
            tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 38:
            tile = new DoorLock5("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 39:
            tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 40:
            tile = new DoorLock6("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 41:
            tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 42:
            tile = new Tile("liquidLavaTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            
            case 49:
            
            tile= new Tile("bg2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 221:
            tile= new Tile ("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 222:
            tile= new Tile ("ladder_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 223:
            tile= new Tile ("rockHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 224:
            tile= new Tile ("rockHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 225:
            tile = new Tile ("ropeHorizontal.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 226:
            tile= new Tile ("ropeVertical.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 227:
            tile= new Tile ("stoneCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 228:
            tile= new Tile("stoneCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 229:
            tile= new Tile("stoneCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 230:
            tile = new Tile("stoneCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 231:
            tile= new Tile("stoneHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 232:
            tile= new Tile("stoneLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 233:
            tile= new Tile("stoneHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 234:
            tile= new Tile("stoneHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 235:
            tile= new Tile("stoneHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 236:
            tile= new Tile("stoneHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 237:
            tile= new Tile("stoneLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 238:
            tile= new Tile("stoneLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 239:
            tile= new Tile ("stoneLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 240:
            tile= new Tile("stoneMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 241:
            tile= new Tile("stoneRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 242:
            tile= new Tile("window.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 74:
            tile= new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 244:
            tile= new Tile("dirtCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid=true;
            break;
            case 245:
            tile= new LavaTile("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid=false;
            break;
            case 246:
            tile= new Tile("keyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 247:
            tile= new SpikesTile("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 82:
            tile= new SpikesTile("fireball.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
            case 84:
            tile= new Tile("bg3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= true;
            break;
           
            
            case 43:
            tile = new coin("coinGold.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 46:
            tile= new Tile("tochLit2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
            case 47:
            tile= new Tile("tochLit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;
         
            
            
            case 248:
            tile= new Tile("stoneMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid=true;
            break;
            case 50:
            tile = new Tile("snow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 61:
            tile = new Tile("snowLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 62:
            tile = new Tile("snowMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 63:
            tile = new Tile("snowRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 64:
            tile = new Tile("snowHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 51:
            tile = new Tile("snowCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 66:
            tile = new Highjump ("springboardUp.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 77:
           
            tile = new Highjump ("springboardUp.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 78:
           
            tile = new Tile("switchMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            case 79:
           
            tile = new Tile ("switchLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            case 80:
           
            tile = new Tile ("switchRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            
            case 67:
           
            tile = new DoorLock7 ("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            
            case 68:
           
            tile = new Tile ("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            
            case 69:
           
            tile = new DoorLock8 ("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            
           case 70:
           
            tile = new Tile ("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = false;
            break;
            
           case 72:
           
           tile = new DoorLock9 ("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
           tile.isSolid = false;
           break;
            
           case 73:
           
           tile = new Tile ("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
           tile.isSolid = false;
           break;
            
           case 75:
           
           tile = new DoorLock10 ("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
           tile.isSolid = false;
           break;
            
           case 76:
           
           tile = new Tile ("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
           tile.isSolid = false;
           break;
          
           case 81:
           tile= new Key3("keyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
           tile.isSolid = false;
           break;
           
           case 83:
           tile= new star("star.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
           tile.isSolid = false;
           break;
           
           case 85:
           tile= new Gem2("gemBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
           tile.isSolid = false;
           break;
           
           case 86:
           tile= new Gem("gemGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
           tile.isSolid = false;
           break;
           
           case 87:
           tile= new Tile("bg5.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
           tile.isSolid = false;
           break;
           
           case 88:
            tile= new Tile("bg6.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid= false;
            break;


            
           
           
           
            
            
            
           
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
       
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
