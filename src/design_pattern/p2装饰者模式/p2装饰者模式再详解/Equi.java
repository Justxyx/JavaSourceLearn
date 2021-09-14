package design_pattern.p2装饰者模式.p2装饰者模式再详解;

/**
 * 装备的超类
 */
public interface Equi {
    /**
     *  攻击力
     * @return
     */
    public int caculateAttack();

    /**
     * 装备描述
     * @return
     */
    public String description();
}
