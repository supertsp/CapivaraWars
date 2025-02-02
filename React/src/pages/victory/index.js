import React, { Component } from "react";
import { Redirect, withRouter } from "react-router-dom";

import imagemMar from "../../assets/images/imagem-mar.jpg";
import capivaraLogo from "../../assets/images/CapivaraWars-logo.png";
import capivaraLoading from "../../assets/images/CapivaraLoading.png";
import victory from "../../assets/images/victory.png";

import "./styles.css";

class Victory extends Component {
  constructor(props) {
    super(props);

    this.state = {
      time: 5,
      redirect: false
    };
  }

  componentDidMount() {
    this.timer();
  }

  handleMovePage = () => {
    if (this.state.redirect) {
      return <Redirect to="/home" />;
    }
  };

  timer = () => {
    let { time } = this.state;
    setInterval(() => {
      if (time > 0) {
        this.setState({ time: time-- });
      } else {
        time = 0;
        this.setState({ redirect: true });
      }
    }, 1000);
  };

  render() {
    return (
      <div>
        {this.handleMovePage()}
        <img src={imagemMar} alt={imagemMar} className="background"></img>
        <div className="container container-lose">
          <div className="row">
            <div className="col-md-12">
              <img
                src={capivaraLogo}
                alt={capivaraLogo}
                className="img-fluid img-fluid-login img-thumbnail img-thumbnail-lose"
              ></img>
            </div>
          </div>
          <img
            src={victory}
            alt={victory}
            className="img-fluid img-fluid-login img-thumbnail img-gameOver-lose"
          ></img>
          <img
            src={capivaraLoading}
            alt={capivaraLoading}
            className="img-fluid img-fluid-capLoading"
          ></img>
        </div>
      </div>
    );
  }
}

export default withRouter(Victory);
