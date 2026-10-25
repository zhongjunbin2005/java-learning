package game.domain;

public class Character {
    public String name;
    public int HP;
    public int maxHP;
    public int attack;
    public int defense;

    public Character() {}

    public Character(String name,int HP,int attack,int defense){
        this.name=name;
        this.HP=HP;
        this.maxHP=HP;
        this.attack=attack;
        this.defense=defense;
    }

    //判断是否存活
    public boolean isAlive(){
        return HP>0;
    }
    //受到治疗效果
    public void heal(int amount){
        HP+=amount;
        if(HP>maxHP){
            HP=maxHP;
        }
    }
    //收到伤害效果
    public void takeDamage(int damage){
        HP-=damage;
        if(HP<0){
            HP=0;
        }
    }

    public String show(){
        return "[当前人物血量："+HP+"攻击力："+attack+"防御力："+defense+"]";
    }

}
