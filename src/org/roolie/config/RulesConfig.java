///////////////////////////////////////////////////////////////////////////////
//  Copyright 2010 Ryan Kennedy <rallyredevo AT users DOT sourceforge DOT net>
//
//  This file is part of Roolie.
//
//  Roolie is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or any later
//  version.
//
//  Roolie is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public License
//  along with Roolie.  If not, see <http://www.gnu.org/licenses/>.
///////////////////////////////////////////////////////////////////////////////

package org.roolie.config;
import org.roolie.config.elmt.RoolieConfigElmt;
import org.roolie.config.elmt.RuleDefinitionsElmt;
import org.roolie.config.elmt.RuleImplementationsElmt;

public class RulesConfig
{
  protected RuleDefinitionsElmt ruleDefinitionElmts;
  protected RuleImplementationsElmt ruleImplementationsElmt;
  protected RoolieConfigElmt roolieConfigElmt;

  public RoolieConfigElmt getRoolieConfigElmt()
  {
    return roolieConfigElmt;
  }

  public void setRoolieConfigElmt(RoolieConfigElmt roolieConfigElmt)
  {
    this.roolieConfigElmt = roolieConfigElmt;
  }

  public RuleDefinitionsElmt getRuleDefinitionElmts()
  {
    return ruleDefinitionElmts;
  }

  public void setRuleDefinitionElmts(RuleDefinitionsElmt ruleDefinitionElmts)
  {
    this.ruleDefinitionElmts = ruleDefinitionElmts;
  }

  public RuleImplementationsElmt getRuleImplementationsElmt()
  {
    return ruleImplementationsElmt;
  }

  public void setRuleImplementationsElmt(RuleImplementationsElmt ruleImplementationsElmt)
  {
    this.ruleImplementationsElmt = ruleImplementationsElmt;
  }
}
