import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';

//Import Globals
import Globals from '../../Globals';

//Import Pages


class Home extends Component {

    render() {

        Globals.criarPartida();

        return (
            <div className="geral mainBackground">
                Home
            </div>
        );
    }
}

//export and allow redirect by "this.props.history"
export default withRouter(Home);