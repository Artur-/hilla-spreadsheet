import '@vaadin/button';
import '@vaadin/notification';
import { Notification } from '@vaadin/notification';
import '@vaadin/text-field';
import { html } from 'lit';
import { customElement } from 'lit/decorators.js';
import { View } from '../../views/view';

@customElement('hilla-view')
export class HillaView extends View {
  connectedCallback() {
    super.connectedCallback();
    this.classList.add('flex', 'p-m', 'gap-m', 'items-end','w-full');
  }

  render() {
    return html` <spread-sheet style="width: 100%; height: 500px"></spread-sheet>`;
  }
}
