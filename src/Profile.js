import React, { useState } from "react";

import { FaChevronLeft, FaChevronRight } from "react-icons/fa";
import reviews from "./data";
function Profile() {
  const [index, setIndex] = useState(0);

  // eslint-disable-next-line no-unused-vars
  const { id, name, job, image, text } = reviews[index];
  const check = (number) => {
    var n = number;
    if (number < 0) {
      n = reviews.length - 1;
    }
    if (number > reviews.length - 1) n = 0;

    return n;
  };
  const nextPerson = () => {
    setIndex(check(index + 1));
  };

  const prevPerson = () => {
    setIndex(check(index - 1));
  };
  return (
    <div>
      <div
        className="card"
        style={{
          width: "26rem",
          display: "block",
          margin: "auto",
          marginTop: "4%",
          paddingBottom: "10px",
        }}
      >
        <img height={340} src={image} className="card-img-top" alt="profile" />
        <div style={{ textTransform: "capitalize" }}>
          <h3 className="card-title">{name}</h3>
          <h2>{job}</h2>
        </div>
        <p>{text}</p>
        <div>
          <FaChevronLeft style={{ color: "blue" }} onClick={prevPerson} />
          <div style={{ display: "inline-block", width: "30px" }}></div>
          <FaChevronRight style={{ color: "blue" }} onClick={nextPerson} />
        </div>

        <button
          style={{ width: "200px", marginTop: "10px" }}
          className="btn btn-primary"
        >
          Surprise
        </button>
      </div>
    </div>
  );
}

export default Profile;
