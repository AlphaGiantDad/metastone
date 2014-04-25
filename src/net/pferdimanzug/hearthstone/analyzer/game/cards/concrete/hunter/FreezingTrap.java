package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.hunter;

import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.SecretCard;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.spells.ReturnMinionToHandSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.Spell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.trigger.secrets.MinionAttacksTrigger;
import net.pferdimanzug.hearthstone.analyzer.game.spells.trigger.secrets.Secret;
import net.pferdimanzug.hearthstone.analyzer.game.spells.trigger.secrets.TargetAttackerSecret;

public class FreezingTrap extends SecretCard {

	public FreezingTrap() {
		super("Freezing Trap", Rarity.COMMON, HeroClass.HUNTER, 2);
		setDescription("Secret: When an enemy minion attacks, return it to its owner's hand and it costs (2) more.");
		
		Spell returnToHandSpell = new ReturnMinionToHandSpell(2);
		Secret secret = new TargetAttackerSecret(new MinionAttacksTrigger(), returnToHandSpell, this);
		setSecret(secret);
	}

}
